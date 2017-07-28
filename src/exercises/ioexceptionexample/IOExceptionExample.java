package exercises.ioexceptionexample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IOExceptionExample {
	public static void main(String[] args) {
		File file = new File("test.txt");
		FileInputStream fileInputStream = null;
//		fileInputStream = new FileInputStream(file);
//		fileInputStream.read();
//		fileInputStream.close();
		
		try{
			fileInputStream = new FileInputStream(file);
			fileInputStream.read();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				fileInputStream.close();
			}
			catch(IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
