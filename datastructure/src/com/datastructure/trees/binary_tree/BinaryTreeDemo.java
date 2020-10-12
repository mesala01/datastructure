package com.datastructure.trees.binary_tree;

public class BinaryTreeDemo {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree(7);
		tree.insert(tree.root,3);
		tree.insert(tree.root,12);
		tree.insert(tree.root,5);
		tree.insert(tree.root,2);
		tree.insert(tree.root,0);
		tree.insert(tree.root,1);
		
		System.out.println("Printing the tree now:");
		System.out.println("Printing the tree in order:");
		tree.inOrderTraversal(tree.root);
		
		System.out.println("Printing the tree in preorder:");
		tree.preOrderTraversal(tree.root);
		System.out.println("Printing the tree in postorder:");
		tree.postOrderTraversal(tree.root);

		
	}

}
