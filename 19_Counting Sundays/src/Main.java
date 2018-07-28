
public class Main {
	public static void main(String[] args) {
		int months = 100 * 12;
		
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int day = 2;
		int month = 0;
		int year = 1901;
		
		int count = 0;
		
		for(int i=1; i<months; i++) {
			int daysToAdd = 0;
			if(month == 1 & isLeapYear(year)) {
				daysToAdd = 29;
			} else {
				daysToAdd = days[month];
			}
			day = (day+daysToAdd)%7;
			
			
			month = (month+1)%12;
			if(month == 0) ++year;
			
			if(day == 0) {
				++count;
				System.out.println(String.format("%4d-%2d-%2d", year, month+1, day+1));
			}
		}
		
		System.out.println(count);
	}
	
	private static boolean isLeapYear(int year) {
		if(year%400 == 0) return true;
		else {
			if(year%100 == 0) return false;
			else if(year%4 == 0) return true;
			else return false;
		}
	}
}
