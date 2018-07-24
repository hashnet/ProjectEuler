import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("files/input.txt"));
		
		List<Integer> seq = collect(sc);
		
		int size = 13;
		
		long maxmult = 0;
		for(int i=0; i<=seq.size()-size; i++) {
			long mult = 1;
			for(int j=0; j<size; j++) {
				mult *= seq.get(i+j);
			}
			if(mult > maxmult) maxmult = mult;
		}
		
		System.out.println(maxmult);
	}
	
	private static List<Integer> collect(Scanner sc) {
		List<Integer> seq = new ArrayList<>();
		
		while(sc.hasNext()) {
			String s = sc.nextLine();
			for(int i=0; i<s.length(); i++) {
				seq.add(Integer.parseInt(String.valueOf(s.charAt(i))));
			}
		}
		
		return seq;
	}
}
