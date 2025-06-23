
public class CsvParser {
	public static void main(String[] args) {
		String csv = "tanaka,35,Tokyo";
	    parseCsv(csv);
	    String wrongCsv = "kimura, 39, Sapporo, Okinawa";
	    parseCsv(wrongCsv);
	}
	
	public static void parseCsv(String csvLine) {
		String[] csvData = csvLine.split(",");
		if(csvData.length == 3) {			
			String name       = csvData[0];
			String age        = csvData[1];
			String birthPlace = csvData[2];
			System.out.println("名前: "   + name      );
			System.out.println("年齢: "   + age       );
			System.out.println("出身地: " + birthPlace);
		} else {
			System.out.println("CSVの形式が正しくありません");
		}
	}
}
