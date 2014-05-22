public class A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("start ");
		A a = new A();
		// int b= a.mul(5, 4);
		System.out.println("REsult ");
		// System.out.println(b);

	}

	public int multiplyNumbers(int M, int N) {

		if ((M == 0) || (N == 0))
			return 0;
		if (M < N) {
			N = N + multiplyNumbers(M - 1, N);
			return N;
		} else {
			M = M + multiplyNumbers(M, N - 1);
			return M;
		}

	}

	static int sum(int a, int b) {
		return a + b;
	}
}
