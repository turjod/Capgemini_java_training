package fileHandeling;

import java.io.File;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) throws IOException {
		String path= "C:\\Users\\User\\Desktop\\turjokelane\\demo.txt";
		File file= new File(path);
		file.createNewFile();
	}
}
