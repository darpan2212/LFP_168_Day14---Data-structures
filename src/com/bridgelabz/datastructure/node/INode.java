package com.bridgelabz.datastructure.node;

public interface INode<K> {

	public K getKey();

	public INode<K> getNext();
	
	public void setNext(INode<K> next);
}