package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.node.INode;
import com.bridgelabz.datastructure.node.MyNode;

public class OrderedList<K extends Comparable<K>> extends UnOrderedList<K> {

	public OrderedList() {
		myLinkedList = new MyLinkedList<>();
	}

	@Override
	public void add(K item) {
		INode<K> itemNode = new MyNode<K>(item);
		myLinkedList.sorted(itemNode);
	}

	@Override
	public void append(K item) {
		add(item);
	}
}