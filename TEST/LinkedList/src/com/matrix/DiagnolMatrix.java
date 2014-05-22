package com.matrix;

public class DiagnolMatrix {
	public static void main(String[] args) {

	}

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
