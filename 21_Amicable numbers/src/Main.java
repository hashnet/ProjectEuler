
public class Main {
	public static void main(String[] args) {
		int range = 10000 - 1;
		
		int[] mem = new int[range+1];
		
		long sum = 0;
		for(int i=2; i<=range; i++) {
			if(isAmicable(i, mem)) sum += i;
		}
		
		System.out.println(sum);
	}
	
	private static boolean isAmicable(int num, int[] mem) {
		int result;
		if(num < mem.length && mem[num] != 0) {
			result = mem[num];
		} else {
			result = sumFactor(num);
			if(num < mem.length) {
				mem[num] = result;
			}
		}
		if(result == num) return false;
		
		int resultP;
		if(result < mem.length && mem[result] != 0) {
			resultP = mem[result];
		} else {
			resultP = sumFactor(result);
			if(result < mem.length) {
				mem[result] = resultP;
			}
		}
		
		if(resultP == num) return true;
		else return false;
	}
	
	private static int sumFactor(int num) {
		int sum = 1;
		
		for(int i=2; i*i <= num; i++) {
			if(num%i == 0) {
				sum += i;
				
				int div = num/i;
				if(div != i) {
					sum += num/i;
				}
			}
		}
		
		return sum;
	}
}
