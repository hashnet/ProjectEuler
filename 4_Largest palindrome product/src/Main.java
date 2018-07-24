
public class Main {
	public static void main(String[] args) {
		System.out.println(result(100, 999));
	}
	
	private static long result(long min, long max) {
		for(long i = max*max; i >= min*min; i--) {
			if(isPal(i)) {
				if(divisible(i, min, max)) return i;
			}
		}
		
		return 0;
	}
	
	private static boolean isPal(long num) {
		String sNum = String.valueOf(num);
		
		for(int i=0; i<sNum.length()/2; i++) {
			if(sNum.charAt(i) != sNum.charAt(sNum.length()-1-i)) return false;
		}
		
		return true;
	}
	
	private static boolean divisible(long num, long min, long max) {
		for(long i=min; i<=max; i++) {
			if(num%i == 0) {
				long rem = num/i;
				if(rem>=min && rem<=max) return true;
			}
		}
		
		return false;
	}
}
