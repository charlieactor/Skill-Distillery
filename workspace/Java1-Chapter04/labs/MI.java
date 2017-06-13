package labs;

public class MI {

	public static void main(String[] args) {
		char first = '\u0043', middle = '\u0052', last = '\u0041';
		// char first = 'C', middle = 'R', last = 'A';
		System.out.println("Initials: " + first + middle + last);
		// If a string is not first, it will add the ASCII value of the chars
		// rather than concatenate them into a string.
		// C = 67, R = 82, A = 65: 67 + 82 + 65 = 214
	}
}
