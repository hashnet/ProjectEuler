import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		int range = 1000;
		
		BigInteger a = new BigInteger("1");
		BigInteger b = new BigInteger("1");
		long index = 2;
		while(true) {
			BigInteger t = a.add(b);
			++index;
			
			if(t.toString().length() >= range) {
				System.out.println(String.format("Index %5d, Number: %s, Length: %d", index, t.toString(), t.toString().length()));
				break;
			}
				
			a = b;
			b = t;
		}
	}
}
