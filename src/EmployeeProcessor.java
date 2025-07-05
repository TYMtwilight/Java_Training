import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EmployeeProcessor {
	public static void main(String[] args) {
		Map<String, Integer> departmentMap = new HashMap<>();
		List<String> employeeCsvList = Arrays.asList(
				"1001, Tanaka, Sales, 35",
				"1002, Suzuki, HR, 28",
				"1003, Sato, Sales, 42",
				"1004, Takahashi, HR, 23"
		);
		for(String employeeCsv: employeeCsvList) {
			// 社員データを分割
			String[] employeeInfo = employeeCsv.split(",");
			
			// 社員IDを抽出
			String idString = employeeInfo[0].trim();
			int id = Integer.parseInt(idString);
			// 名前を抽出
			String name = employeeInfo[1].trim();
			// 部署を抽出
			String department = employeeInfo[2].trim();
			// 年齢を抽出
			String ageString = employeeInfo[3].trim();
			int age = Integer.parseInt(ageString);

			// 年齢が30歳以上の社員のみを対象にして、出力
			if(age >= 30) {
				System.out.println("社員ID: " + id + "、氏名: " + name + "、部署: " + department + "、年齢: " + age);
			}
			
			// 各部署ごとに対象社員を集計
			incrementValue(departmentMap, department);
		}
		
		for(Map.Entry<String, Integer> entry: departmentMap.entrySet()) {
			System.out.println("部署: " + entry.getKey() + "、対象人数: " + entry.getValue());
		}
	}
	
	public static void incrementValue(Map<String, Integer> map, String key) {
		// 指定されたキーの値を取得
		Integer count = map.get(key);
		
		// マップにキーのマッピングが含まれていない場合、キーを値1でマップする
		if(count == null) {
			map.put(key, 1);
		}
		// それ以外の場合は、見つかった値を1つインクリメントする
		else {
			map.put(key, count + 1);
		}
	}
	
}
