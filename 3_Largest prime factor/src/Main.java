
public class Main {
	public static void main(String[] args) {
		System.out.println(maxPrimeFact(600851475143L));
	}
	
	private static long maxPrimeFact(long n) {
		if(n == 1) return 1;
		
		long div = 2;
		while(true) {
			if(n == div) return n;
			
			if(n%div == 0) n = n/div;
			else div = nextDiv(div);
		}
	}
	
	private static long nextDiv(long n) {
		if(n == 2) return 3;
		else return n + 2;
	}
}
