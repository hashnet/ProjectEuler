import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("files/input.txt"));
		int n = 20;
		int[][] matrix = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int m = 4;
		long mult = 0;
		for(int i=0; i<n-m; i++) {
			for(int j=0; j<n-m; j++) {
				//Horizontal
				long t = 1;
				for(int k=j; k<j+m; k++) {
					t *= matrix[i][k];
				}
				if(t > mult) mult = t;
				
				//Vertical
				t = 1;
				for(int k=i; k<i+m; k++) {
					t *= matrix[k][j];
				}
				if(t > mult) mult = t;
			
				//Diagonal up to down
				t = 1;
				for(int k=i, l=j; k<i+m; k++, l++) {
					t *= matrix[k][l];
				}
				if(t > mult) mult = t;
				
				//Diagonal down to up
				t = 1;
				for(int k=i+m, l=j; l<j+m; k--, l++) {
					t *= matrix[k][l];
				}
				if(t > mult) mult = t;
			}
		}
		
		System.out.println(mult);
		sc.close();
	}
}
