package com.bridgelabz.datastructure.node;

public class MyNode<K> implements Node<K> {

	K key;
	Node<K> next;

	public MyNode(K key) {
		this.key = key;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public Node<K> getNext() {
		return next;
	}

	@Override
	public void setNext(Node<K> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "MyNode{key=" + key + "}=>";
	}
}
