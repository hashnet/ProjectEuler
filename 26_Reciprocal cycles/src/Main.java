import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		int range = 1000 - 1;
		
		int max = 0;
		int answer = -1;
		
		ElapsedTime et = ElapsedTime.getInstance();
		et.start();
		for(int i=2; i<=range; i++) {
			int result = countRep(i);
			if(result > max) {
				max = result;
				answer = i;
			}
		}
		et.end();
		et.printElapsed();
		
		System.out.println(String.format("%5d: %d", answer, max));
	}
	
	private static int countRep(int n) {
		Map<Integer, Integer> map = new HashMap<>();
		int div = 10;
		int step = 1;
		map.put(div, step);
		
		while(true) {
			while(div < step) {
				div *= 10;
				++step;
				if(map.containsKey(div)) return step - map.get(div);
				else map.put(div, step);
			}
				
			if(div%n == 0) return 0;
			
			div = (div%n)*10;
			++step;
			if(map.containsKey(div)) return step - map.get(div);
			else map.put(div, step);
		}
	}
}
