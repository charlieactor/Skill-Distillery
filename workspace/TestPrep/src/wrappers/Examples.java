package wrappers;

import java.util.ArrayList;
import java.util.List;

public class Examples {
	
	public static Integer objectChange(Integer intOb) {
		intOb = intOb + 10;
		return intOb;
	}
	
	public static void main(String[] args) {
		// AutoBoxing!
		Integer myInteger = new Integer(500);
		int myInt = myInteger;// UNBOXED!
		int someInt = 12;
		List<Integer> listOfFun = new ArrayList<>();
		listOfFun.add(myInteger);
		listOfFun.add(myInt); // AUTOBOX...ROLL OUT!
		listOfFun.add(someInt);// FURTHER AUTOBOXING!
		int myListedInt = listOfFun.get(0); // AUTOBOX...UHH UN-ROLL OUT, YEAH!
		
		
		
		//Fun with trying to mutate the immutable:
		Integer inty = new Integer(10);
		Integer inty2 = objectChange(inty);
		System.out.println(inty==inty2);
		System.out.println(inty.equals(inty2));
		System.out.println(inty);
		System.out.println(inty2);
		
		
		

		// Constructors!
		 Byte b = new Byte((byte)1);
		 Short s = new Short((short)1);
		// Aren't Bytes and Shorts annoying?
		Integer i = new Integer(1);
		Character c = new Character('c');
//		 Character failedC = new Character("c");
		Long l = new Long(2l); // AUTO PROMOTED TO LONG (L IS ADDED FO' FREE)
		Float f = new Float(2.8938); // SIMILARLY, F IS NOT NECESSARY DUE TO PROMOTION

		Long loooong = new Long("123"); // Auto-Parsed! Whaaaaat!?!?
		Long looong = new Long(Long.valueOf("123"));
		
		// Parsing Strings to primitives!
		boolean someBoolean = Boolean.parseBoolean("TrUe");
		double someDouble = Double.parseDouble("123.245");

		// Parsing Strings into Wrappers!
		String truthy = "true";
		String funnyNum = "8008";
		Boolean questLove = Boolean.valueOf(truthy); // BECAUSE ?UESTLOVE IS THE TRUTH
		Integer actuallyANumber = Integer.valueOf(funnyNum);// DO YOU GET IT
		
		// typeValue()
		Boolean boolie = new Boolean("true");
		Double doolie = new Double(Double.valueOf("25.4"));

//		 System.out.println(boolie);
		System.out.println(boolie.booleanValue());
//		 System.out.println(doolie);
		System.out.println(doolie.doubleValue());
//		 System.out.println(actuallyANumber);
		System.out.println(actuallyANumber.intValue());

		// Caches
		Integer i1 = 100;
		Integer i2 = 100;
		
		if (i1 == i2) {
			System.out.println("i1 and i2 are the same.");
		}
		if (i1 != i2) {
			System.out.println("i and i2 are different.");
		}
		if (i1.equals(i2)) {
			System.out.println("i1 and i2 have the same value.");
		}
		
		Integer i5 = 155;
		Integer i6 = 155;
		
		if (i5 == i6) {
			System.out.println("i5 and i6 are the same");
		}
		if (i5 != i6) {
			System.out.println("i5 and i6 are different");
		}
		if (i5.equals(i6)){
			System.out.println("i5 and i6 have the same value");
		}

		Integer i3 = new Integer(100);
		Integer i4 = new Integer(100);
		if (i3 == i4) {
			System.out.println("i3 and i4 are the same object, dawg");
		}
		if (i3.equals(i4)) {
			System.out.println("i3 and i4 have the same value, bruh");
		}
	}
}
