/*
package examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyImage {
	private byte[] byteArray;

	public static void main(String[] args) {
		CopyImage ci = new CopyImage("duke.png");
		ci.copyFile("java-mascot.png");
	}

	public CopyImage(String filename) {
		File file = new File(filename);
		byteArray = new byte[(int) file.length()];
		FileInputStream inputStream = new FileInputStream(file);
		inputStream.read(byteArray);
		inputStream.close();
	}

	public void copyFile(String filename) {
		if (byteArray != null) {
			FileOutputStream outputStream = new FileOutputStream(filename);
			outputStream.write(byteArray);
			System.out.println("Image copied to: " + filename);
			outputStream.close();
		}
	}
	
}
*/