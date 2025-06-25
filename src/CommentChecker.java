import java.util.Objects;

public class CommentChecker {
	public static void main(String[] args) {
		checkComment(null);
		checkComment("これはテストです");
		checkComment("    ");
	}
	
	public static void checkComment(String comment) {
		if(Objects.isNull(comment)) {
			System.out.println("コメントが入力されていません");
		} else {
			String trimmedComment = comment.trim();
			if(trimmedComment.isEmpty()) {
				System.out.println("コメントが入力されていません");
			} else {
				System.out.println("コメントを受け付けました: " + trimmedComment);
			}
		}
	}
}
