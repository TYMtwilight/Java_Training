
public class FileChecker {
	public static void main(String[] args) {
		checkFile("document.txt");
		checkFile("image.jpg");
		checkFile("readme.TXT");
	}
	
	public static void checkFile(String fileName) {
		if( fileName.endsWith(".txt")) {
			System.out.println(fileName + " はテキストファイルです");
		} else {
			System.out.println(fileName + " はテキストファイルではありません");
		}
	}
}
