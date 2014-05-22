import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = { 11, 18, 21, 28, 31, 38, 40, 55, 60, 62 };
		B b = new B();
		Node n1, n2, n3;
		n1 = new Node();
		n2 = new Node();
		n3 = new Node();
		n1.val = 1;
		n1.next = n2;
		n2.val = 2;
		n2.next = n3;
		n3.val = 3;

		reverseLinkedList(n1);
		// int r = isIntegerPalindrome(123214);
		// int y = b.findsum(a, 68);
		// System.out.println(y);
	}

	private static Node reverseLinkedList(Node head) {
		if (head == null) {
			return null;
		}
		ArrayList<Node> nodeStack = new ArrayList<Node>();

		Node start = head;
		while (start.next != null) {
			Node temp  =  start.next;
			start.next = null; 
			nodeStack.add(temp);
			System.out.println(temp.val);
		}
		
		Node temp = null;
		for (int i = nodeStack.size()-1; i > 0; i--) {
			temp=  nodeStack.get(i);
			temp.next = nodeStack.get(i - 1);
			System.out.println(temp.val);
		}
		temp.next= null;
	
//		start= nodeStack.get(0);
//		System.out.println(start.val);
//		while (start.next != null) {
//
//			nodeStack.add(start);
//			start = start.next;
//			System.out.println(start.val);
//		}

		return nodeStack.get(0);
	}

	public int findsum(int[] a, int x) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == x)
					return 1;
			}
		}
		return 0;
	}

	static int isSumPossible(Vector<Integer> a, int N) {
		for (int i = 0; i < a.size() - 1; i++) {
			for (int j = i + 1; j < a.size(); j++) {
				if (a.get(i) + a.get(j) == N)
					return 1;
			}
		}
		return 0;
	}

	static int isIntegerPalindrome(int a) {
		int digits[] = new int[20];
		int i = 0;
		while (a > 0) {
			digits[i] = a % 10;
			a = a / 10;
			i++;
		}
		int k = i - 1;
		int j = 0;
		while (k >= j) {

			if (digits[j] != digits[k]) {
				return 0;
			}
			k--;
			j++;
		}
		return 1;

	}
}
