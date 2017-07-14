package wrappers;

public class TestQuestion {

	public static void main(String args[]) {

	Integer val1 = new Integer(5);
	int val2 = 9;
	testInts(val1++, ++val2);
	System.out.println(val1 + " " + val2);
	}
	
	//Primitives pass to methods by VALUE
	//Objects pass to methods by REFERENCE VALUE!
	
	public static void testInts(Integer obj, int var) {
		obj = var++;
		obj++;
	}

}
