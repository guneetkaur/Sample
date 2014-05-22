package com.list;

public class ReverseList {

	public static void main(String[] args) {
		Node node1 = new Node(5, new Node(4, new Node(2, new Node(3, null))));
		Node.printNode(node1);
		System.out.println("******************");
//		printNode(reverse(node1));
		Node.printNode(reverseRecursive(node1));
	}

	private static Node reverse(Node start) {
		Node prev, node, next;
		if ((start == null) || (start.next == null)) {
			return start;
		} else {
			prev= null; 
			node = start;
			while (node != null) {
				next= node.next;
				node.next= prev;
				prev= node;
				node= next;
			}
		}
		return prev;
	}

	private static Node reverseRecursive(Node start){
		if(start.next == null)
			return start;
		else {
//			start.next = reverseRecursive(start.next);
			return reverseRecursive(start.next);
		//	System.out.println(start.data);
		}
		
		
	}
	
}
