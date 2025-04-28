package fileHandeling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class DeSerializableEmployee {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String path = "C:\\Users\\User\\Desktop\\turjokelane\\sero.txt";
		File file = new File(path);
		FileInputStream fos = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fos);
		Employee employee = (Employee)ois.readObject();
		System.out.println(employee);
	}
}
