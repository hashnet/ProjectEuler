
public class Main {
	public static void main(String[] args) {
		int range = 10001;
		long num = 2;
		for(int i=1; i<=range; i++) {
			while(!isPrime(num)) ++num;
			
			System.out.println(num);
			++num;
		}
	}
	
	private static boolean isPrime(long n) {
		if(n == 2) return true;
		if(n%2 == 0) return false;
		
		for(long i=3; i*i <= n; i+=2) {
			if(n%i == 0) return false;
		}
		
		return true;
	}
}
