import java.math.BigInteger;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println("    Result :  " + s.solution(50000));
	}

	public int solution(int N) {
		return findSumOfDigits(factorial(N));

	}

	public BigInteger factorial(int n) {
		if(n <= 0){
			return BigInteger.valueOf(n);
		}
		BigInteger result = BigInteger.ONE;
		for (int i = n; i > 0; i--) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		System.out.println(result);
		return result;

	}

	public int findSumOfDigits(BigInteger n) {
		if (n.intValue() <= -1)
			return -1;
		BigInteger k;
		BigInteger result = BigInteger.ZERO;
		while (n != BigInteger.ZERO) {
			k = n.mod(BigInteger.valueOf(10));
			result = result.add(k);
			
			if (result.intValue() > 100000000) {
				result = BigInteger.valueOf(-1);
				break;
			}
			n = n.divide(BigInteger.valueOf(10));
		}
		return result.intValue();
	}
	
}
