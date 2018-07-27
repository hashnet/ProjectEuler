import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		BigInteger sum = new BigInteger("0");
		
		Scanner sc = new Scanner(new FileInputStream("files/input.txt"));
		while(sc.hasNext()) {
			String str = sc.nextLine();
			BigInteger num = new BigInteger(str);
			sum = sum.add(num);
		}
		
		String result = sum.toString();
		
		System.out.println(result.substring(0, 10));
		
		sc.close();
	}
}
