package com.tree;

public class Tree {
	Tree left;
	Tree right;
	int data;

	public Tree(Tree left, int data, Tree right) {
		this.left = left;
		this.right = right;
		this.data = data;
	}

}
