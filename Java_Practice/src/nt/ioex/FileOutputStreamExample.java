/**
 * 
 */
package nt.ioex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author mapit
 *
 */
public class FileOutputStreamExample {

	/**
	 * 
	 */
	public FileOutputStreamExample() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("F://java_test_io.txt");
			String text = "This is the class";
			byte[] b = text.getBytes();
			fileOutputStream.write(b);
			fileOutputStream.close();
			System.out.println("File output stream closed..");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
