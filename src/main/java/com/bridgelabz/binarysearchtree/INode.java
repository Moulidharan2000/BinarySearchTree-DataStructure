package com.bridgelabz.binarysearchtree;

public class INode<T extends Comparable<T>> {
	
	T key;
	INode<T> left, right;
	
	public INode(T item) {
		
		key = item;
		left= right = null;
	}
}
