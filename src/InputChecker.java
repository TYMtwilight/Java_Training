
public class InputChecker {
	public static void main(String[] args) {
		checkInput(" ");
		checkInput("Hello");
		checkInput("");
	}
	
	public static void checkInput(String input) {
		if(input.trim().isEmpty()) {
			System.out.println("入力が空です");
		} else {
			System.out.println("入力ありがとうございます");
		}	
	}
}
