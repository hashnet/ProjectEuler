import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		BigInteger two = new BigInteger("2");
		
		String str = two.pow(1000).toString();
		
		System.out.println(str);
		
		long sum = 0;
		for(int i=0; i<str.length(); i++) {
			sum += str.charAt(i) - '0';
		}
		
		System.out.println(sum);
	}
}
