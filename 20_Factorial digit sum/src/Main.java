import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		int n = 100;
		
		BigInteger result = new BigInteger(String.valueOf(n));
		while(--n >= 2) {
			result = result.multiply(new BigInteger(String.valueOf(n)));

		}
		
		String strResult = result.toString();
		long sum = 0;
		for(int i=0; i<strResult.length(); i++) {
			sum += Long.parseLong(String.valueOf(strResult.charAt(i)));
		}
		
		System.out.println(sum);
	}
}
