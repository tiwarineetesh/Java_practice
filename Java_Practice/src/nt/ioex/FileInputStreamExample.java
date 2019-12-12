/**
 * 
 */
package nt.ioex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author mapit
 *
 */
public class FileInputStreamExample {
	
	private FileInputStream fileInputStream = null;

	/**
	 * 
	 */
	public FileInputStreamExample() {
		// TODO Auto-generated constructor stub
	}
	
	private void getText() {
		
		try {
			fileInputStream = new FileInputStream("F://java_test_io.txt");
			int x = fileInputStream.read();
			System.out.println((char)x);
			fileInputStream.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	} 
	
	private void getFullText() {
		
		try {
			fileInputStream = new FileInputStream("F://java_test_io.txt");
			int x = 0;
			while((x = fileInputStream.read()) !=-1) {
				System.out.print((char)x);				
			}
			System.out.println("");
			fileInputStream.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	} 
	
	public static void main(String[] args) {
		
		FileInputStreamExample fileInputStreamExample = new FileInputStreamExample();
		fileInputStreamExample.getFullText();
		fileInputStreamExample.getText();
		
	}

}
