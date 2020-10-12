package com.datastructure.trees.binary_tree;

import com.datastructure.trees.binary_tree.Node;

public class BinaryTree {
	Node root;
	
	// Constructor
	public BinaryTree(int data) {
		this.root = new Node(data);			
	}
	
	//Constructor 
	public BinaryTree() {
		this.root = null;
	}
	
	
	/*
	 * Inserts data into the tree. If data is greater than the node data. 
	 * look at the data in the right node if not null, calls insert on the right node.
	 * Otherwise insert the data into the right node
	 */
	public void insert(Node node, int data) {
		if(data <= node.data) {
			if (node.lChild == null) {
				node.lChild = new Node(data);
				}
			else {
				this.insert(node.lChild,data);
			}
				
		}
		
		if(data > node.data) {
			if(node.rChild == null) {
				node.rChild = new Node(data);	

		}
			else {
				this.insert(node.rChild,data);
			}
		}
		
	}
	
	//Prints the data from the left subtree , the root then the right subtree
	public void inOrderTraversal(Node node) {
		if(node.lChild != null) {
			this.inOrderTraversal(node.lChild);
		}
		System.out.println(node.data);
		
		if(node.rChild != null) {
			this.inOrderTraversal(node.rChild);
		}
		
		
	}

	//Prints the data from the, root left subtree then the right subtree.
	public void preOrderTraversal(Node node) {
		if(node !=null) {
			System.out.println(node.data);
			this.preOrderTraversal(node.lChild);
			this.preOrderTraversal(node.rChild);						
		}
			
		}
	
	//Prints the data from the left subtree ,the right subtree then the root.
	public void postOrderTraversal(Node node) {
		if(node != null) {
			this.postOrderTraversal(node.lChild);
			this.postOrderTraversal(node.rChild);
			System.out.println(node.data);
		}
		
	}
	
	
	
	
}
	


