
public class Main {
	public static void main(String[] args) {
		long num1 = 1;
		long num2 = 2;
		long next = num1 + num2;
		
		long sum = 2;
		long range = 4_000_000;
//		long range = 90;
		while(next <= range) {
			if(next%2 == 0) sum += next;
			
			num1 = num2;
			num2 = next;
			next = num1 + num2;
		}
		
		System.out.println(sum);
	}
}
