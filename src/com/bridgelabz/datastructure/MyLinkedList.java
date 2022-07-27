package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.node.INode;

public class MyLinkedList<K> {

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
		if(head == null) {
			head = node;
		} else {
			node.setNext(head);
			head = node;
		}
		if(tail == null) {
			tail = node;
		}
	}
	
	public void print() {
		INode<K> tempNode = head;
		while (tempNode != null) {
			System.out.print(tempNode);
			tempNode = tempNode.getNext();
		}
	}

}