package examples;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExamples {
	
	/*
	 * Create static fields for each definition below based on the functional
	 * interface, method, and functionality. Interface : method : functionality
	 * Note that functionality may define the type of a parameterized interface.
	 */

	/*
	 * Runnable : void run() : System.out.println("Running")
	 */
	static Runnable runLambda = () -> System.out.println("Running");
	static Runnable runLambda2 = () -> {
		System.out.println("Running");
	};
	/*
	 * java.util.concurrent.Callable<V> : V call() : return the current year as
	 * an Integer
	 */
	static Callable<Integer> callYear = (() -> {
		return LocalDateTime.now().getYear();
	});

	/*
	 * Comparator<T> : int compare(T o1, T o2) : compare Planet diameters
	 */
	static Comparator<Planet> planetDiameters = (Planet p1, Planet p2) -> {
		if (p1.getDiameter() > p2.getDiameter()) {
			return 1;
		} else if (p1.getDiameter() < p2.getDiameter()) {
			return -1;
		} else {
			return 0;
		}
	};

	/*
	 * Predicate<T> : boolean test(T o1) : return true if Planet name contains
	 * "u"
	 */
	static Predicate<Planet> containsU = (Planet p1) -> {
		if (p1.getName().toLowerCase().contains("u")) {
			return true;
		} else {
			return false;
		}
	};
	/*
	 * BiPredicate<T, U> : boolean test(T t, U u) : return true if Planet name
	 * contains the given String, case-insensitive
	 */
	
	static BiPredicate<Planet, String> containsString = (Planet p, String s) -> {
		if (p.getName().toLowerCase().contains(s.toLowerCase())) {
			return true;
		} else {
			return false;
		}
	};

	/*
	 * Function<T, R> : R apply(T t) : return the President's name in the format
	 * "Lastname, Firstname"
	 */
	static Function<President, String> lastFirst = (President p) -> {
		StringBuilder lastFirst = new StringBuilder();
		lastFirst.append(p.getLastName());
		lastFirst.append(", ");
		lastFirst.append(p.getFirstName());
		String lastFirstString;
		lastFirstString = lastFirst.toString();
		
		return lastFirstString;
	};

	/*
	 * BiFunction<T, U, R> : R apply(T t, U u) : Replace all vowels in a
	 * President's first and last name with a sequential number starting with U
	 * u, and return the transformed name String. For example u = 0, President
	 * name "Abraham Lincoln" is returned "0br1h2m L3nc4ln".
	 */
	
	static BiFunction<President, Integer, String> vowelReplace = (President p, Integer u) -> {
		String noVowelName = "";
		String presName = p.getFirstName() + " " + p.getLastName();
		presName = presName.toLowerCase();
		
		for (int i = 0; i < presName.length(); i++){
			if (presName.charAt(i) == 'a' || presName.charAt(i) == 'e' || presName.charAt(i) == 'i'
					|| presName.charAt(i) == 'o' || presName.charAt(i) == 'u') {
				noVowelName += u;
				u++;
			}
			else {
				noVowelName += presName.charAt(i);
			}
		}
		return noVowelName;
	};
}
