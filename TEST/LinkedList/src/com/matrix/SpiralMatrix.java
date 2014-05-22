package com.matrix;

public class SpiralMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		spiralMatrix();
	}

	static int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
			{ 13, 14, 15, 16 }, { 17, 18, 19, 20 } };
	static int rows = a.length;
	static int col = a[0].length;

	private static void spiralMatrix() {
		printArray(a);
		printTopRight(0, rows - 1, 0, col - 1);
	}

	static void printTopRight(int rowS, int rowE, int colS, int colE) {
		// System.out.println("*********Top*******");
		// System.out.println("row strt: "+ rowS);
		// System.out.println("row end: "+ rowE);
		// System.out.println("Col strt: "+ colS);
		// System.out.println("Col end: "+ colE);
		if (rowE < rowS) {
			return;
		}
		int i = rowS;
		int j = colS;
		while (j <= colE) {
			System.out.println(a[rowS][j]);
			j++;
		}
		i++;
		while (i <= rowE) {
			System.out.println(a[i][colE]);
			i++;
		}
		printBottomLeft(rowS + 1, rowE, colS, colE - 1);

	}

	static void printBottomLeft(int rowS, int rowE, int colS, int colE) {
		// System.out.println("*****Bottom***********");
		// System.out.println("row strt: "+ rowS);
		// System.out.println("row end: "+ rowE);
		// System.out.println("Col strt: "+ colS);
		// System.out.println("Col end: "+ colE);
		if (rowE < rowS) {
			return;
		}
		int i = rowE;
		int j = colE;
		while (j >= colS) {
			System.out.println(a[rowE][j]);
			j--;
		}
		i--;
		while (i >= rowS) {
			System.out.println(a[i][colS]);
			i--;
		}
		printTopRight(rowS, rowE - 1, colS + 1, colE);
	}

	// static void printTopRight(int[][] a, int row, int col, int x, int y){
	// int i=x;
	// int j= y;
	// while(j<col){
	// System.out.println(a[i][j]);
	// ++j;
	// }
	// j--;
	// i++;
	// while(i<row){
	// System.out.println(a[i][j]);
	// i++;
	// }
	// System.out.println("***********************");
	// System.out.println("i: "+ i);
	// System.out.println("j: "+ j);
	// System.out.println("***********************");
	// if((row-x)>0)
	// printBottomLeft(a, row-1, col-1, i-1, j-1);
	// }
	//
	// static void printBottomLeft(int[][] a, int row, int col, int x, int y){
	// int i=x;
	// int j= y;
	// while(j>0){
	// System.out.println(a[i][j]);
	// j--;
	// }
	//
	// while(i>0){
	// System.out.println(a[i][j]);
	// i--;
	// }
	// System.out.println("***********************");
	// System.out.println("i: "+ i);
	// System.out.println("j: "+ j);
	// System.out.println("***********************");
	// if((col-y)>0)
	// printTopRight(a, row-2, col-2, i+1, j+1);
	//
	// }
	static void printArray(int[][] a) {
		int rows = a.length;
		int col = a[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a[i][j] + "      ");
			}
			System.out.println();
		}

	}

}
