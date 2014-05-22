package com.sort;

public class MergeSort {
	static int[] a = { 6, 5, 3, 1, 8, 7, 2, 4 ,2,0, -20, -10};
	static int[] temp = new int[a.length];

	public static void main(String[] args) {
		mergeSort(0, a.length - 1);
		printArray(0, a.length - 1);

	}

	static void mergeSort(int low, int high) {
		int mid;
		if (low < high) {
			mid =  (high + low) / 2;
			mergeSort(low, mid);
			mergeSort(mid + 1, high);
			merge(mid, low, high);
		}

	}

	static void merge(int mid, int low, int high) {
		for (int x = low; x <= high; x++) {
			temp[x] = a[x];
		}
		int i = low;
		int j = mid + 1;
		int pos = low;
		while (i <= mid && j <= high) {
			if (temp[i] <= temp[j]) {
				a[pos] = temp[i];
				i++;
			} else {
				a[pos] = temp[j];
				j++;
			}
			pos++;
		}
		while (i <= mid) {
			a[pos] = temp[i];
			i++;
			pos++;
		}
		while (j <= high) {
			a[pos] = temp[j];
			j++;
			pos++;
		}
	}

	static void printArray(int low, int high) {
		System.out.println("*************");
		for (int i = low; i <= high; i++) {
			System.out.println(a[i]);
		}
		System.out.println("*************");

	}

}
