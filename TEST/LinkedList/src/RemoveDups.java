public class RemoveDups {

	static int[] arr = { 1, 1, 3, 3, 3, 5, 5, 5, 9, 9, 9, 9 };

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		removeDupe();

	}

	static void removeDupe() {
		int temp[] = new int[arr.length];
		temp[0] = arr[0];
		int k = 0;
		for (int i = 1; i < arr.length; i++) {
			if (temp[k] != arr[i]) {
				k++;
				temp[k] = arr[i];
				
			}
		}
		printArray(temp);
	}

	static void printArray(int[] a) {
		System.out.println("*************");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("*************");

	}
}
