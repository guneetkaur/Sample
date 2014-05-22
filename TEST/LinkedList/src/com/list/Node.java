package com.list;
public class Node {
	int data;
	Node next;
	public Node(int data, Node next){
		this.data= data;
		this.next= next;
	}
	public static void printNode(Node start) {
		while (start != null) {
			System.out.println(start.data);
			start = start.next;
		}
	}
}
