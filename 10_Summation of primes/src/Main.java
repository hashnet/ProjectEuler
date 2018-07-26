import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int range = 2_000_000 - 1;
		boolean[] isPrime = seive(range);
		
		long sum = 0;
		for(int i=2; i<=range; i++) {
			if(isPrime[i]) sum += i;
		}
		
		System.out.println(sum);
	}
	
	private static boolean[] seive(int range) {
		boolean[] isPrime = new boolean[range + 1];
		Arrays.fill(isPrime, Boolean.TRUE);
		
		for(int i=2; i*i <= range; i++) {
			if(isPrime[i]) {
				for(int j=i+i; j<= range; j+=i) {
					isPrime[j] = false;
				}
			}
		}
		
		return isPrime;
	}
}
