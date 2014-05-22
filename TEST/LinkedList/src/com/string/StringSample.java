package com.string;

public class StringSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// reverseWords2();
		// System.out.println(checkPalindrome());
		// perm1("abc");
		// printAnagrams("", "abc");
		// removeDups("aabeebbebcc", false);
		//reversWord();
		reverse("hello", 0);
	}

	private static void reverseWords2() {
		String str = "Rahul is a good boy";
		String[] strArray = str.split(" ");
		StringBuilder result = new StringBuilder();
		for (int i = strArray.length - 1; i >= 0; i--) {
			result.append(strArray[i]);
			if (i > 0)
				result.append(" ");
		}
		System.out.println(result);

	}

	static void reversWord() {
		String str = "Rahul is a good boy";
		// char[] arr = str.toCharArray();

		String[] wordsArray = str.split(" ");
		StringBuilder result = new StringBuilder();
		for (String st : wordsArray) {
			char[] arr = st.toCharArray();
			for (int i = arr.length - 1; i >= 0; i--)
				result.append(arr[i]);
			result.append(' ');

		}
		System.out.println(result);

	}

	private static boolean checkPalindrome() {
		String str = "aabfebaa";
		boolean result = true;
		char[] arr = str.toCharArray();
		int i = 0;
		int j = arr.length - 1;
		while (j >= i) {
			if (arr[i] != arr[j])
				result = false;
			j--;
			i++;
		}
		return result;
	}

	static void removeDups(String str, boolean success) {
		System.out.println(str);
		if (success) {
			return;
		}
		success = true;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i - 1) == str.charAt(i)) {
				System.out.println("i:   " + i);
				if (i == str.length() - 1) {
					System.out.println("in if : ");
					str = str.substring(0, i);

				} else {

					System.out.println("in else:  " + str.substring(0, i));
					str = str.substring(0, i)
							+ str.substring(i + 1, str.length());
					System.out.println(str);
				}
				success = false;
			}
		}
		if (!success) {
			removeDups(str, success);
		}

	}

	static void intersection() {
		int[] a = {};
		int[] b = {};

	}

	static void printAnagrams(String prefix, String str) {
		int length = str.length();
		if (length == 0) {
			System.out.println(prefix);

		}
		for (int i = 0; i < length; i++) {
			printAnagrams(prefix + str.charAt(i),
					str.substring(0, i) + str.substring(i + 1, length));
		}
	}
	
	
	public static void  reverse(String str, int start) {
		System.out.println(str);
		System.out.println(start);
	    if ((null == str) || (start == str.length())) {
	        return ;
	    }
	    str = str.substring(1)+ str.charAt(0);
	    reverse(str, start+1);
	}
	

}
