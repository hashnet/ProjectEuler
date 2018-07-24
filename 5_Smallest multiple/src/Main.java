
public class Main {
	public static void main(String[] args) {
		long range = 20;
		
		long lcm = 1;
		for(long i=1; i<=range; i++) {
			lcm = lcm(lcm, i);
		}
		
		System.out.println(lcm);
	}
	
	private static long gcd(long a, long b) {
		while(b!=0) {
			long t = b;
			b = a%b;
			a = t;
		}
		
		return a;
	}
	
	private static long lcm(long a, long b) {
		long g = gcd(a, b);
		
		return a*b/g;
	}
}
