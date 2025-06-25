
public class DateParser {
	public static void main(String[] args) {
		String date = "2025-06-23";
		parseDate(date);
	}
	
	public static void parseDate(String date) {
		String yearString = date.substring(0,4);
		String monthString = date.substring(5,7);
		String dateString = date.substring(8,10);
		System.out.println("年: " + yearString);
		System.out.println("月: " + monthString);
		System.out.println("日: " + dateString);
	}
}
