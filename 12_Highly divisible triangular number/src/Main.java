
public class Main {
	public static void main(String[] args) {
		int n = 500;
		
		long num = 0;
		for(long i=1; ;i++) {
			num += i;
			
			if(factorCount(num) > n) {
				System.out.println(num);
				break;
			}
		}
	}
	
	private static int factorCount(long num) {
		if(num <= 1) return 1;
		
		int count = 2;
		for(long i=2; i*i < num; i++) {
			if(num%i == 0) {
				long j = num/i;
				
				if(i != j)	count += 2;
				else count += 1;
			}
		}
		
		return count;
	}
}
