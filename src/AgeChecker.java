
public class AgeChecker {
	public static void main(String[] args) {
		String csv = "tanaka, 35, Tokyo";
		checkAge(csv);
	}
	
	public static void checkAge(String csvLine) {
		String[] csvData = csvLine.split(",");
		if(csvData.length != 3) {
			System.out.println("csvデータに誤りがあります");
			return;
		}
		String name = csvData[0].trim();
		String ageString = csvData[1].trim();
		int age = Integer.parseInt(ageString);
		if(age >= 35) {
			System.out.println(name + " さんは大人です");
		} else {
			System.out.println(name + " さんは未成年です");
		}
	}
}
