import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {
		greetUser(Optional.empty());
		greetUser(Optional.of("suzuki"));
	}
	
	public static void greetUser(Optional<String> name) {
		if(name.isPresent()) {
			System.out.println("ようこそ、 " + name.get() + " さん");
		} else {
			System.out.println("ユーザー名が未設定です");
		}
	}
}
