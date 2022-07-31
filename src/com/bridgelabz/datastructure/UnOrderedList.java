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
		myLinkedList.add(itemNode);
	}

	public void append(K item) {
		INode<K> itemNode = new MyNode<K>(item);
		myLinkedList.append(itemNode);
	}
	
	public void insert(K item, int pos) {
		INode<K> itemNode = new MyNode<K>(item);
		myLinkedList.insert(itemNode, pos);
	}
	
	public void remove(K item) {
		INode<K> itemNode = new MyNode<K>(item);
		myLinkedList.remove(itemNode);
	}

	public boolean search(K item) {
		INode<K> itemNode = new MyNode<K>(item);
		return myLinkedList.search(itemNode);
	}

	public boolean isEmpty() {
		return myLinkedList.isEmpty();
	}
	
	public int size() {
		return myLinkedList.size();
	}
	
	public int index(K item) {
		INode<K> itemNode = new MyNode<K>(item);
		return myLinkedList.index(itemNode);
	}
	
	public K pop() {
		return myLinkedList.popLast().getKey();
	}
	
	public void print() {
		myLinkedList.print();
	}
}