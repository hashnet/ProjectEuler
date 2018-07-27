
public class Main {
	private static int range = 1_000_000 - 1;
	private static int maxArr = 3*range + 1;
	private static int[] countArr = new int[maxArr + 1];
	
	public static void main(String[] args) {
		int start = -1;
		int max = 0;
		countArr[1] = 1;
		
		for(int i=113383; i<=range; i++) {
			int count = collatz(i);
			
			if(count <= maxArr) {
				countArr[i] = count;
			}
			//System.out.println(String.format("Starting number = %d; Sequence length = %d", i, count));
			
			if(count > max) {
				max = count;
				start = i;
			}
		}
		
		System.out.println(String.format("Starting number = %d; Sequence length = %d", start, max));
	}
	
	private static int collatz(long num) {
		int count = 0;
		
		while(true) {
			if(num <= maxArr) {
				if(countArr[(int)num] != 0) {
					return countArr[(int)num] + count;
				}
			}
			if(num%2 == 0) num /= 2;
			else num = 3*num + 1;
			
			++count;
		}   
	}
}
