import java.util.HashMap;
import java.util.Map;

public class EmployeeLister {
	public static void main(String[] args) {
		Map<Integer, String> employeeMap = new HashMap<>();
		employeeMap.put(1001, "Tanaka");
		employeeMap.put(1002, "Suzuki");
		employeeMap.put(1003, "Sato");
		
		printEmployees(employeeMap);
	}
	
	public static void printEmployees(Map<Integer, String> map) {
		for(Map.Entry<Integer, String>entry: map.entrySet()) {
			System.out.println("社員ID: " + entry.getKey() + "、氏名: " + entry.getValue());
		}
	}
}
