package com.list;

public class DoubleList {
	int data;
	DoubleList next;
	Node down;
	public DoubleList(int data, DoubleList next, Node down){
		this.data= data;
		this.next= next;
		this.down= down;
	}

	public static void printNode(Node start) {
		while (start != null) {
			System.out.println(start.data);
			start = start.next;
		}
	}
}
