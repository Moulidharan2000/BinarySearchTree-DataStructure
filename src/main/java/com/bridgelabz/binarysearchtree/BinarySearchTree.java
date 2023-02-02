package com.bridgelabz.binarysearchtree;

public class BinarySearchTree<T extends Comparable<T>> {

	INode<T> root;
	int size;
	
	BinarySearchTree(){
		root = null;
	}
	
	void insert(T key) {
		root = insertRec(root, key);
		size++;
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
	
	public int Size() {
		return size;
	}
	
	public static void main(String[] args) {
		
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
		bst.insert(56);
		bst.insert(30);
		bst.insert(70);
		bst.insert(22);
		bst.insert(40);
		bst.insert(60);
		bst.insert(95);
		bst.insert(11);
		bst.insert(65);
		bst.insert(3);
		bst.insert(16);
		bst.insert(63);
		bst.insert(67);		
		bst.inorder();
		
		if(bst.Size() == 13)
			System.out.println("\nAll Elements are Present !!!");
		else
			System.out.println("All Elemens are Not Present !!!");		
	}
}
