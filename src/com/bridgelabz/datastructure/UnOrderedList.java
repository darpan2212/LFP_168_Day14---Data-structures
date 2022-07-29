package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.node.INode;
import com.bridgelabz.datastructure.node.MyNode;

public class UnOrderedList<K> {

	MyLinkedList<K> myLinkedList;
	
	public UnOrderedList(){
		myLinkedList = new MyLinkedList<>();
	}
	
	public void add(K item) {
		INode<K> itemNode = new MyNode<K>(item);
		myLinkedList.append(itemNode);
	}
	
	public void remove(K item) {
		INode<K> itemNode = new MyNode<K>(item);
		myLinkedList.remove(itemNode);
	}

	public void print() {
		myLinkedList.print();
	}
}