package com.bridgelabz.datastructure.node;

public class MyNode<K extends Comparable<K>> implements INode<K> {

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
		if (next != null)
			return "MyNode{key:" + key + "}=>" + next;
		else
			return "MyNode{key:" + key + "}";
	}

	@Override
	public int compareTo(INode<K> node) {
		return this.getKey().compareTo(node.getKey());
	}
}
