package com.string;

public class LongestSubStirng {

	/**
	 * @param args
	 */
	
	Gen<Integer, String, String> g = new Gen<Integer, String, String>(1, "hello", "");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "This is a test String";
		String b = "tests";
		substr(a, b);
		
	
	}

	static void substr(String a, String b) {
		int lenA = a.length();
		int lenB = b.length();
		int index = a.indexOf(b.charAt(0));
		for (int i = index; i < lenB; i++) {

		}

	}

	class Gen<T, V, X> {
		T objT;
		V objV;
		X objX;
		
		public Gen(T t, V v, X x){
			objT= t;
			objV= v;
			objX= x;
		}

	}
}
