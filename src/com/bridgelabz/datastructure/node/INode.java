package com.bridgelabz.datastructure.node;

public interface INode<K> extends Comparable<INode<K>> {

	public K getKey();

	public INode<K> getNext();
	
	public void setNext(INode<K> next);

}