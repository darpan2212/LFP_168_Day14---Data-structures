package com.bridgelabz.datastructure.node;

public interface Node<K> {

	public K getKey();

	public Node<K> getNext();
	
	public void setNext(Node<K> next);
}