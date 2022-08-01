package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.node.INode;

public class MyLinkedList<K extends Comparable<K>> {

	INode<K> head;
	INode<K> tail;

	public void append(INode<K> node) {
		if (head == null) {
			head = node;
		}
		if (tail == null) {
			tail = node;
		} else {
			tail.setNext(node);
			tail = node;
		}
	}

	public void add(INode<K> node) {
		if (head == null) {
			head = node;
		} else {
			node.setNext(head);
			head = node;
		}
		if (tail == null) {
			tail = node;
		}
	}

	public void print() {
		System.out.println(head);
		/*
		 * INode<K> tempNode = head; while (tempNode != null) {
		 * System.out.print(tempNode); tempNode = tempNode.getNext(); }
		 */
	}

	public void add(INode<K> node, int index) {
		INode<K> tempNode = head;
		for (int i = 0; i < index - 1; i++) {
			tempNode = tempNode.getNext();
		}
		if (tempNode != null) {
			node.setNext(tempNode.getNext());
			tempNode.setNext(node);
		} else {
			System.out.println(
					"List index is out of bound, you can not add new element at index "
							+ index);
		}
	}

	public INode<K> pop() {
		INode<K> tempNode = head;
		if (tempNode != null) {
			head = tempNode.getNext();
			tempNode.setNext(null);
		}
		return tempNode;
	}

	public INode<K> peek() {
		return head;
	}

	public INode<K> popLast() {
		INode<K> poppedOut = null;
		if (head == tail) {
			poppedOut = head;
			head = null;
			tail = null;
		} else {
			INode<K> tempNode = head;
			while (tempNode.getNext().getNext() != null) {
				tempNode = tempNode.getNext();
			}
			poppedOut = tempNode.getNext();
			tempNode.setNext(null);
			tail = tempNode;
		}
		return poppedOut;
	}

	public void remove(INode<K> itemNode) {
		INode<K> tempNode = head;
		if (tempNode.getKey().equals(itemNode.getKey())) {
			pop();
		}
		while (tempNode != null) {
			if (tempNode.getNext() != null
					&& tempNode.getNext().getKey().equals(itemNode.getKey())) {
				INode<K> removedNode = tempNode.getNext();
				tempNode.setNext(tempNode.getNext().getNext());
				removedNode.setNext(null);
				return;
			}
			tempNode = tempNode.getNext();
		}
	}

	public boolean search(INode<K> itemNode) {
		INode<K> tempNode = head;
		while (tempNode != null) {
			if (tempNode.getKey().equals(itemNode.getKey())) {
				return true;
			}
			tempNode = tempNode.getNext();
		}
		return false;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int size() {
		int size = 0;
		INode<K> tempNode = head;
		while (tempNode != null) {
			tempNode = tempNode.getNext();
			size++;
		}
		return size;
	}

	public int index(INode<K> itemNode) {
		int index = 0;
		INode<K> tempNode = head;
		while (tempNode != null) {
			if (tempNode.getKey().equals(itemNode.getKey())) {
				return index;
			}
			tempNode = tempNode.getNext();
			index++;
		}
		return -1;
	}

	public void insert(INode<K> itemNode, int pos) {
		INode<K> tempNode = head;
		if (pos <= size()) {
			if (pos == 0) {
				/*
				 * head = itemNode; itemNode.setNext(tempNode);
				 */
				itemNode.setNext(head);
				head = itemNode;
			} else {
				for (int i = 0; i < pos - 1; i++) {
					tempNode = tempNode.getNext();
				}
				INode<K> nextNode = tempNode.getNext();
				tempNode.setNext(itemNode);
				itemNode.setNext(nextNode);
			}
		} else {
			System.out.println("At index " + pos + ", new item can not be inserted");
		}
	}

	public void sorted(INode<K> node) {
		if (head == null) {
			add(node);
		} else {
			int index = 0;
			INode<K> tempNode = head;
			if (node.compareTo(tempNode) < 0) {
				add(node);
			} else {
				while (tempNode != null) {
					index++;
					if (tempNode.getNext() != null
							&& node.compareTo(tempNode.getNext()) < 0) {
						break;
					}
					tempNode = tempNode.getNext();
				}
				insert(node, index);
			}
		}
	}

}