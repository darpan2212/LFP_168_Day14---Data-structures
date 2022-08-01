package com.bridgelabz.datastructure.stack;

import com.bridgelabz.datastructure.MyLinkedList;
import com.bridgelabz.datastructure.node.INode;
import com.bridgelabz.datastructure.node.MyNode;

public class Stack<K extends Comparable<K>> {

	MyLinkedList<K> myLinkedList;

	public Stack() {
		myLinkedList = new MyLinkedList<>();
	}

	public void push(K item) {
		INode<K> itemNode = new MyNode<K>(item);
		myLinkedList.add(itemNode);
	}

	public K pop() {
		INode<K> popNode = myLinkedList.pop();
		return popNode != null ? popNode.getKey() : null;
	}

	public K peek() {
		return myLinkedList.peek().getKey();
	}

	public boolean isEmpty() {
		return myLinkedList.isEmpty();
	}

	public int size() {
		return myLinkedList.size();
	}

	public void print() {
		myLinkedList.print();
	}
}