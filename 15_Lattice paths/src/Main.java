
public class Main {
	private static final int xMax = 20;
	private static final int yMax = 20;
	
	public static void main(String[] args) {
		long[][] matrix = new long[yMax+1][xMax+1];
	
		for(int i=0; i<=yMax; i++) {
			matrix[i][0] = 1;
		}
		for(int j=0; j<=xMax; j++) {
			matrix[0][j] = 1;
		}
		
		for(int i=1; i<=yMax; i++) {
			for(int j=1; j<=xMax; j++) {
				matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
			}
		}
		
		System.out.println(matrix[yMax][xMax]);
	}
}
