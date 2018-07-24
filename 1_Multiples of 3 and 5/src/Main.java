
public class Main {
	public static void main(String[] args) {
		long range = 1000-1;
		long sum = countDivByN(range, 3) + countDivByN(range, 5) - countDivByN(range, 15);
		System.out.println(sum);
	}
	
	private static long countDivByN(long range, int n) {
		long x = range/n;
		
		return ((long)n * x * (x+1))/2;
	}
}
