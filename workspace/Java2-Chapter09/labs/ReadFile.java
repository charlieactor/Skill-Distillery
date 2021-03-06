package labs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	String fileName;
	int objectNum;
	

	public static void main(String[] args) {
		ReadFile rf1 = new ReadFile("ThreadTest.txt", 1);
		ReadFile rf2 = new ReadFile("ThreadTest.txt", 2);
		ReadFile rf3 = new ReadFile("ThreadTest.txt", 3);

		rf1.startThread();
		rf2.startThread();
		rf3.startThread();

//		rf1.runIt();
//		rf2.run();
//		rf3.run();
	}

	public ReadFile(String fileName, int objectNum) {
		this.fileName = fileName;
		this.objectNum = objectNum;
	}

	public void startThread() {
		theThread.start();
	}

	Runnable runIt = (() -> {
		try {
			BufferedReader bufIn = new BufferedReader(new FileReader(this.fileName));
			String line;
			for (int i = 0; i <= 5; i++) {
				line = bufIn.readLine();
				if (i < 5) {
					System.out.println(this.objectNum + " " + line);
				} else {
					Thread.yield();
				}
			}
			bufIn.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	});
	Thread theThread = new Thread(runIt);

	// public void run() {
	// try {
	// BufferedReader bufIn = new BufferedReader(
	// new FileReader(this.fileName));
	// String line;
	// for (int i = 0; i <= 5; i++) {
	// line = bufIn.readLine();
	// if (i < 5) {
	// System.out.println(this.objectNum + " " + line);
	// }
	// else {
	// Thread.yield();
	// }
	// }
	// bufIn.close();
	// } catch (FileNotFoundException e) {
	// e.printStackTrace();
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	// }
}
