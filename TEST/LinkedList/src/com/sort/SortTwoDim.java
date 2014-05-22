package com.sort;

public class SortTwoDim {
	static int[] a = { 6, 5, 3, 1, 8, 7, 2, 4 ,2,0, -20, -10};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
System.out.println(checkPower(18));
	}
	
	static boolean checkPower(int n ){
		while(n%3==0){
			if(n==3){
				return true;
			}
			n=n/3;
			System.out.println(n);
		}
		return false;
	}
	static void printArray(int low, int high) {
		System.out.println("*************");
		for (int i = low; i <= high; i++) {
			System.out.println(a[i]);
		}
		System.out.println("*************");

	}
}
