package com.list;

public class SortList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node node1 = new Node(5, new Node(4, new Node(2, new Node(3, new Node(
				10, null)))));
		Node.printNode(sortList(node1));

	}

	static Node sortList(Node start) {
		if ((start == null) || (start.next == null)) {
			return start;
		}
		Node mid = middleNode(start);
		Node l = start, r = null;
		r = mid.next;
		mid.next = null;
		return merge(sortList(l), sortList(r));
	}

	static Node middleNode(Node start) {
		Node slow = start, fast = start;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	static Node merge(Node l, Node r) {
		Node mergeHead = new Node(100, null);
		Node current = mergeHead;
		while (l != null && r != null) {
			if (l.data <= r.data) {
				current.next = l;
				l = l.next;
			} else {
				current.next = r;
				r = r.next;
			}
			current = current.next;
		}
		if (l != null) {
			current.next = l;
		} else
			current.next = r;
		return mergeHead.next;
	}

}
