package fileHandeling;

 	 vvL
 	 .import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingData {

	public static void main(String[] args) throws IOException{
	String path = "C:\\Users\\User\\Desktop\\turjokelane\\demo.txt";
	File file = new File(path);
	FileInputStream fis = new FileInputStream(file);
	char x;
	while((x=(char)fis.read())!=(char)-1) {
	System.out.print(x);
	}
 }
}
   