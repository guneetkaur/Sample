package com.search;

public class Binary {

	/**
	 * @param args
	 */
	static int[] arr = { 1, 2, 3, 5, 6, 7, 9 };

	public static void main(String[] args) {
		// System.out.println(binarySearch(9, 0, arr.length - 1));
		System.out.println(multiply(2, 3));

	}

	static int binarySearch(int num, int low, int high) {
		if (high < low)
			return -1;
		int mid = (low + high) / 2;
		if (num == arr[mid])
			return mid;
		else if (num > arr[mid])
			return binarySearch(num, mid + 1, high);
		else
			return binarySearch(num, low, mid - 1);

	}

	static int multiply(int a, int b) {
		int maxCount, val, result = 0;
		if (a > b) {
			maxCount = b;
			val = a;

		} else {
			maxCount = a;
			val = b;
		}
		for (int i = 0; i < maxCount; i++) {
			System.out.println(result);
			result = result + val;
		}
		return result;
	}

}
