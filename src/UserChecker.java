import java.util.Arrays;
import java.util.List;

public class UserChecker {
	public static void main(String[] args) {
		checkUser("taro");
	    checkUser("jiro");
	    checkUser("hana");
	}
	
	public static void checkUser(String name) {
		List<String> userList = Arrays.asList("taro", "jiro", "saburo");
		
		if(userList.contains(name)) {
			System.out.println(name + " は登録済みです");
		} else {
			System.out.println(name + " は登録されていません");
		}
	}
}
