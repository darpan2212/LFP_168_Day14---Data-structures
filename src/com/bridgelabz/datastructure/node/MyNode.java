package com.bridgelabz.datastructure.node;

public class MyNode<K> implements INode<K> {

	public K key;
	public INode<K> next;

	public MyNode(K key) {
		this.key = key;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public INode<K> getNext() {
		return next;
	}

	@Override
	public void setNext(INode<K> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "MyNode{key:" + key + "}=>";
	}
}
