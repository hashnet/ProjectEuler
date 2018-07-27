import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(6, "six");
		map.put(7, "seven");
		map.put(8, "eight");
		map.put(9, "nine");
		map.put(10, "ten");
		map.put(11, "eleven");
		map.put(12, "twelve");
		map.put(13, "thirteen");
		map.put(14, "fourteen");
		map.put(15, "fifteen");
		map.put(16, "sixteen");
		map.put(17, "seventeen");
		map.put(18, "eighteen");
		map.put(19, "nineteen");
		map.put(20, "twenty");
		map.put(30, "thirty");
		map.put(40, "forty");
		map.put(50, "fifty");
		map.put(60, "sixty");
		map.put(70, "seventy");
		map.put(80, "eighty");
		map.put(90, "ninety");
		map.put(100, "hundred");
		map.put(1000, "thousand");
		
		long sum = 0;
		for(int i=1; i<=1000; i++) {
			String str = word(i, map);
			int count = str.length();
			sum += count;
			
			System.out.println(String.format("Number: %d, Word: %s, Length: %d", i, str, count));
		}
		
		System.out.println("Total: " + sum);
	}
	
	private static String word(int num, Map<Integer, String> map) {
		String str = "";
		
		int thousand = num / 1000;
		if(thousand > 0) {
			if(!str.isEmpty()) str = str + "and";
			
			str = str + map.get(thousand) + map.get(1000);
		}
		num %= 1000;
		
		int hundred = num / 100;
		if(hundred > 0) {
			if(!str.isEmpty()) str = str + "and";
			
			str = str + map.get(hundred) + map.get(100);
		}
		num %= 100;
		
		int ten = num / 10;
		if(ten > 0) {
			if(!str.isEmpty()) str = str + "and";
			
			if(num < 20) {
				str = str + map.get(num);
			} else {
				str = str + map.get(ten*10);
				if(num%10 > 0) {
					str = str + map.get(num%10);
				}
			}
		} else if(num%10 > 0) {
			if(!str.isEmpty()) str = str + "and";
			str = str + map.get(num%10);
		}
		
		return str;
	}
}
