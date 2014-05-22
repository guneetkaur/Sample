package com.search;

import java.util.HashSet;

public class ArraysSample {

	static int[] a = { 2, -4, 6, -3, 5, 7 };
	static int[] b = { 1, 2, 3 };
	
	static int arr[] = new int[5];

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printComposition(5, 0);
//		fibonaci(5);
//		maxSubArrayProblem(a);
//		printAllSets(0);
		// arrangeOddEven();
		// HashSet<Integer> s = new HashSet<Integer>(4);
		// s.add(4);
		// System.out.println(s.add(4));
		// System.out.println(s.size());
	}

	static void arrangeOddEven() {
		int[] aux = new int[a.length];
		int oddIndex = 1, evenIndex = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				aux[evenIndex] = a[i];
				evenIndex = evenIndex + 2;
			} else {
				aux[oddIndex] = a[i];
				oddIndex = oddIndex + 2;
			}
		}
		printArray(aux);

	}

	static void printAllSets(int indexS) {
		if (indexS == a.length)
			return;
		for (int i = 0; i < indexS; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.println(a[j]);
			}
			System.out.println("*************");
		}

		printAllSets(indexS + 1);
	}

	static int[] x = new int[b.length];

	static void printAllCombos(int n, int i) {
		if (n == 0) {
			printArray(x);
		}
	

	}
	
	static void maxSubArrayProblem(int[] A){
		int maxSofar = 0, maxEnding= 0;
		for(int i = 0;i<A.length;i++){
			maxEnding=  Math.max(0, maxEnding+A[i]);
			maxSofar= Math.max(maxSofar, maxEnding);
		}
		System.out.println(maxSofar);
	}

	static void printArray(int[] x) {
		System.out.println("*************");
		for (int i = 0; i <= x.length - 1; i++) {
			System.out.println(x[i]);
		}
		System.out.println("*************");

	}
	static void fibonaci(int n ){
		int prev=1, next=1, sum;
		
		for(int i = 1;i<=n;i++){
			System.out.println(prev);
			sum = prev+next;
			prev= next;
			next= sum;
		
		}		
	}
	static int max= 3;
	static void printComposition(int n , int i){
		if(n==0){
			printArray(arr);
		}
		else if(n>0){
			for(int k =1;k<=max; k++){
				arr[i]=k;
				printComposition(n-k, i+1);
			}
		}
		
	}

}
