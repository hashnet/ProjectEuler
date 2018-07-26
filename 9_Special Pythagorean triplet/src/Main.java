
public class Main {
	public static void main(String[] args) {
		double x = 1000;
		double y = x/2;
	
		int a, b, c = 0;
		
		boolean solutionFound = false;
		for(double i=1; i<y; i++) {
			double result = (2*y) * (y - i) / ((2*y) - i);
			
			if(Math.floor(result) == result) {
				solutionFound = true;
				System.out.println("Solution found:");
				
				a = (int)i;
				b = (int)result;
				c = (int)Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
				System.out.println(String.format("a = %d, b = %d, c = %d", a, b, c));
				System.out.println(String.format("a^2 = %d, b^2 = %d, c^2 = %d",  a*a, b*b, c*c));
				System.out.println(String.format("a + b + c = %d", a+b+c));
				System.out.println(String.format("a . b. c = %d", a*b*c));
			}
		}
		
		if(!solutionFound) {
			System.out.println("Solution not found.");
		}
	}
}
