package com.bridgelabz.binarysearchtree;

public class BinarySearchTree<T extends Comparable<T>> {

	INode<T> root;
	
	BinarySearchTree(){
		root = null;
	}
	
	void insert(T key) {
		root = insertRec(root, key);
	}
	
	INode<T> insertRec(INode<T> root, T key) {
		
		if(root == null) {
			root = new INode<T>(key);
			return root;
		}
		if(key.compareTo((T) root.key) < 0)
			root.left = insertRec(root.left,  key);
		else if(key.compareTo((T) root.key) > 0)
			root.right = insertRec(root.right,  key);
		
		return root;
	}
	
	void inorder() {
		inorderRec(root);
	}
	
	void inorderRec(INode<T> root) {
		
		if(root != null) {
			inorderRec(root.left);
			System.out.print(root.key+" ");
			inorderRec(root.right);
		}
	}
	
	public static void main(String[] args) {
		
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
		bst.insert(56);
		bst.insert(30);
		bst.insert(70);
		bst.inorder();
	}
}
