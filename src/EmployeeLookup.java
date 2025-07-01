import java.util.HashMap;
import java.util.Map;

public class EmployeeLookup {
	public static void main(String[] args) {
		checkEmployee(1001);
		checkEmployee(1002);
		checkEmployee(9999);
	}
	
	public static void checkEmployee(int id) {
		Map<Integer, String> employeeMap = new HashMap<>();
		employeeMap.put(1001, "Tanaka");
		employeeMap.put(1002, "Suzuki");
		employeeMap.put(1003, "Sato");
		if(employeeMap.containsKey(id)) {
			System.out.println("社員名: " + employeeMap.get(id));
		} else {
			System.out.println("該当する社員が見つかりません");
		}
	}
}
