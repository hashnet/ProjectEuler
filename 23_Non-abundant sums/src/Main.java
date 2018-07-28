import java.util.HashMap;
import java.util.Map;

public class Main {
	private static Map<Integer, Integer> map= new HashMap<>();
	
	public static void main(String[] args) {
		int range = 28123;
		long sum = 23*24/2;
		for(int i=24; i<=range; i++) {
			if(isSummable(i)) {
				System.out.println(String.format("%5d is     Summable. Total Sum = %10d.", i, sum));
			} else {
				sum += i;
				System.out.println(String.format("%5d is Not Summable. Total Sum = %10d.", i, sum));
			}
		}
		
		System.out.println(sum);
	}
	
	private static boolean isSummable(int sum) {
		for(int i=12; i<=sum/2; i++) {
			if(isAbundant(i) && isAbundant(sum-i)) return true;
		}
		
		return false;
	}
	
	private static boolean isAbundant(int num) {
		if(!map.containsKey(num)) {
			map.put(num, sumPropDiv(num));
		}
		
		if(map.get(num) > num) return true;
		else return false;
	}
	
	private static int sumPropDiv(int num) {
		int sum = 1;
		for(int i=2; i*i <= num; i++) {
			if(num%i == 0) {
				sum += i;
			
				int div = num/i;
				if(div != i) sum += div;
			}
		}
		
		return sum;
	}
}
