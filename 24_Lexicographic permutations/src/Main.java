import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	private static int count = 0;
	private static final int maxCount = 1_000_000;
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		for(int i=0; i<=9; i++) list.add(String.valueOf(i));
		
		System.out.println(list);
		
		String str = new String();
		next(str, list);
	}
	
	private static void next(String str, List<String> list) {
		if(count > maxCount) System.exit(0);
		
		if(list.isEmpty()) {
			System.out.println(String.format("Count: %5d, Permutation: %s", ++count, str));
			return;
		}
		
		Collections.sort(list);
		String[] arr = new String[list.size()];
		for(int i=0; i<arr.length; i++) {
			arr[i] = list.get(i);
		}
		
		for(int i=0; i<arr.length; i++) {
			list.remove(arr[i]);
			
			next(str + arr[i], list);
			
			list.add(arr[i]);
		}
	}
}
