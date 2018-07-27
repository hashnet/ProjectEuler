import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("files/input.txt"));
//		Scanner sc = new Scanner(new FileInputStream("files/sample.txt"));
		
		int max = 15;
//		int max = 4;
		long sum[][] = new long[max][max];
		
		for(int i=0; i<max; i++) {
			for(int j=0; j<=i; j++) {
				sum[i][j] = sc.nextLong();
			}
		}
			
		for(int i=max-2; i>=0; i--) {
			for(int j=0; j<=i; j++) {
				sum[i][j] = Math.max(sum[i+1][j], sum[i+1][j+1]) + sum[i][j];
			}
		}
		
		System.out.println(sum[0][0]);
		sc.close();
	}
}
