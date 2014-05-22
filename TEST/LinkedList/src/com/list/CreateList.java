package com.list;

public class CreateList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node node1 = new Node(10,
				new Node(11, new Node(12, new Node(15, null))));
		Node node2 = new Node(6, new Node(8, new Node(13, null)));
		Node node3 = new Node(14, new Node(19, null));
		Node node4 = new Node(20, new Node(22, new Node(24, null)));
		DoubleList list1 = new DoubleList(5, null, node1);
		DoubleList list2 = new DoubleList(7, null, node2);
		DoubleList list3 = new DoubleList(9, null, node3);
		DoubleList list4 = new DoubleList(18, null, node4);
		list1.next = list2;
		list2.next = list3;
		list3.next = list4;
		Node.printNode(splitDoubleList(list1));
	}

	static Node splitDoubleList(DoubleList start) {
	
		if (start.next == null) {
			Node node = new Node(start.data, start.down);
			return node;
		}
		DoubleList mid = getDoubleListMid(start), left, right;
		left = start;
		right = mid.next;
		mid.next = null;
		return mergedList(splitDoubleList(left), splitDoubleList(right));
	}

	static Node mergedList(Node l, Node r) {
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
		System.out.println("***********");
		Node.printNode(mergeHead);
		System.out.println("***********");
		return mergeHead.next;
	}

	static DoubleList getDoubleListMid(DoubleList start) {
		DoubleList slow = start, fast = start;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;

	}

	static Node middleNode(Node start) {
		Node slow = start, fast = start;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

}
