package examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Race implements Callable<String> {
	static List<String> theList;

//	public void run() {
//		for (int i = 0; i < 20; i++) {
//			theList.add(Thread.currentThread().getName() + i);
//		}
//	}

	public static void main(String[] args) throws Exception {
		theList = Collections.synchronizedList(new ArrayList<>());
		
		ExecutorService ex = Executors.newFixedThreadPool(3);
		Future<String> result = ex.submit(new Race());
		Future<String> result2 = ex.submit(new Race());
		Future<String> result3 = ex.submit(new Race());
		String callBack = result.get();
		String callBack2 = result2.get();
		String callBack3 = result3.get();
		System.out.println(callBack);
		System.out.println(callBack2);
		System.out.println(callBack3);
		ex.shutdown();

//		Thread thread1 = new Thread(race, "A");
//		Thread thread2 = new Thread(race, "B");
//		Thread thread3 = new Thread(race, "C");

//		thread1.start();
//		thread2.start();
//		thread3.start();
//
//		thread1.join();
//		thread2.join();
//		thread3.join();

		Iterator<String> it = theList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("Size of the list " + theList.size());
	}

	@Override
	public String call() throws Exception {
		for (int i = 0; i < 20; i++) {
			theList.add(Thread.currentThread().getName() + i);
		}
		System.out.println("Calling done");
		return "Done";
	}
}