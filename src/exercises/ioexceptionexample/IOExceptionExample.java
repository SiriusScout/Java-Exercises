package exercises.ioexceptionexample;

import java.io.File;
import java.io.FileInputStream;

public class IOExceptionExample {
	public static void main(String[] args) {
		File file = new File("test.txt");
		FileInputStream fileInputStream = null;
		
		try{
			fileInputStream = new FileInputStream(file);
			fileInputStream.read();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			//fileInputStream.close();
		}
	}
}
