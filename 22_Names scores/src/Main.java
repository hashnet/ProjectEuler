import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("files/input.txt"));
		
		String str = sc.nextLine();
		
		str = str.replaceAll("\"", "");
		String[] names = str.split(",");
		
		for(int i=0; i<names.length; i++) {
			names[i] = names[i].toLowerCase();
		}
		
		Arrays.sort(names);
		
		long sum = 0;
		for(int i=0; i<names.length; i++) {
			sum += (i+1) * score(names[i]);
		}
		
		System.out.println(sum);
	}
	
	private static int score(String str) {
		int sum = 0;
		for(int i=0; i<str.length(); i++) {
			sum += str.charAt(i)-'a'+1;
		}
		
		return sum;
	}
}
