package com.tree;

import java.util.ArrayList;

public class BinarySearchTree {

	static int[] pre = { 20, 15, 10, 17, 25, 22, 27 };
	static int[] in = { 10, 15, 17, 20, 22, 25, 27 };

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tree root = new Tree(new Tree(new Tree(null, 10, null), 15, new Tree(
				null, 17, null)), 20, new Tree(new Tree(null, 22, null), 25,
				new Tree(null, 27, null)));
		printRootToLeaf(root, new ArrayList<Integer>());
		//vertical(root);
		// findElement(root);
		// printPreorderBST(root);
		// System.out.println("***********");
		// printInorderBST(root);
		// System.out.println(findHeight(root));
		// printInorderBST(constructTree1(pre, in, 0, pre.length - 1, 0,
		// in.length - 1));
	}
	
	static void printRootToLeaf(Tree root, ArrayList<Integer> path){
		if(root == null){
			return;
		}
		path.add(root.data);
		System.out.println(path);
		System.out.println("*********");
		if(root.left==null && root.right== null){
			System.out.println(path);
			return;
		}
		printRootToLeaf(root.left, new ArrayList<Integer>(path));
		printRootToLeaf(root.right, new ArrayList<Integer>(path));
	}

	static Tree constructTree1(int[] pre, int[] in, int preS, int preE,
			int inStrt, int inEnd) {

		if (inStrt > inEnd) {
			return null;
		}
		Tree root = new Tree(null, pre[preS], null);
		int i;
		int currentIndex = -1;
		for (i = 0; i < in.length; i++) {
			if (pre[preS] == in[i]) {
				currentIndex = i;
				break;
			}
		}
		int len = i - inStrt;
		System.out.println("root: " + root.data);
		root.left = constructTree1(pre, in, preS + 1, preS + len, inStrt,
				currentIndex - 1);
		root.right = constructTree1(pre, in, preS + len + 1, preE,
				currentIndex + 1, inEnd);
		return root;

	}


	static void printTreeVertical(Tree root, int line, int height) {
		if (root == null)
			return;
		if (line == height) {
			System.out.println(root.data);
		}
		printTreeVertical(root.left, line, height - 1);
		printTreeVertical(root.right, line, height + 1);
	}

	static int min = 0, max = 0;

	static void vertical(Tree root) {

		horizontalDistance(root, 0);
		System.out.println("Min : " + min);
		System.out.println("MAx: " + max);
		for (int i = min; i <= max; i++) {
			printTreeVertical(root, i, 0);

		}
	}

	static void horizontalDistance(Tree node, int height) {
		if (node == null)
			return;
		if (height < min) {
			min = height;
		} else
			max = height;
		horizontalDistance(node.left, height - 1);
		horizontalDistance(node.right, height + 1);

	}

	static void printPreorderBST(Tree root) {
		if (root == null)
			return;
		else
			System.out.println(root.data);
		printPreorderBST(root.left);
		printPreorderBST(root.right);

	}

	static void printInorderBST(Tree root) {
		if (root == null)
			return;
		else {
			printInorderBST(root.left);
			System.out.println(root.data);
			printInorderBST(root.right);
		}
	}

	static void printPostorder(Tree root) {
		if (root == null)
			return;
		else {
			printPostorder(root.left);
			printPostorder(root.right);
			System.out.println(root);
		}

	}

	static int findHeight(Tree root) {
		if (root == null) {
			return 0;
		} else
			return 1 + Math.max(findHeight(root.left), findHeight(root.right));

	}

}
