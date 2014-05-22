package com.string;

public class LCS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a = "GTA";
		String b = "GTXY";
		lcs(a, b);
	}

	public static String lcs(String a, String b) {
		int length[][] = new int[a.length() + 1][b.length() + 1];
		for (int i = 0; i <= a.length(); i++) {
			for (int j = 0; j <= b.length(); j++) {
				if (i == 0 || j == 0) {
					length[i][j] = 0;

				} else if (a.charAt(i - 1) == b.charAt(j - 1)) {
					length[i][j] = 1 + length[i - 1][j - 1];
				} else
					length[i][j] = Math.max(length[i - 1][j], length[i][j - 1]);

			}
		}
		printArray(length);
		
		StringBuffer sb = new StringBuffer();
	    for (int x = a.length(), y = b.length();
	         x != 0 && y != 0; ) {
	        if (length[x][y] == length[x-1][y])
	            x--;
	        else if (length[x][y] == length[x][y-1])
	            y--;
	        else {
	            assert a.charAt(x-1) == b.charAt(y-1);
	            sb.append(a.charAt(x-1));
	            x--;
	            y--;
	        }
	    }
	    System.out.println(sb.toString());

		return "";
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
