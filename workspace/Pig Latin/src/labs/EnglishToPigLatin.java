package labs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EnglishToPigLatin {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a word or a sentence to be translated: ");
		String[] entry;
		String userEntry;
		userEntry = input.nextLine();
		entry = userEntry.split(" ");

		EnglishToPigLatin p = new EnglishToPigLatin();
		System.out.println(p.interpret(entry));
		input.close();
	}

	public EnglishToPigLatin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StringBuilder interpret(String[] stringArray) {
		StringBuilder newsb = new StringBuilder();

		Pattern patt = Pattern.compile("^([^aeiouAEIOU])");
		Pattern patt2 = Pattern.compile("^([^aeiouAEOIU])([^aeiouAEIOU])");
		
		for (int i = 0; i < stringArray.length; i++) {
			StringBuilder sb = new StringBuilder(stringArray[i]);
			Matcher m = patt.matcher(stringArray[i]);
			Matcher m2 = patt2.matcher(stringArray[i]);
			

			if (m2.find()) {
				sb.append(m2.group(1) + m2.group(2) + "ay");
				sb.deleteCharAt(0);
				sb.deleteCharAt(0);
				newsb.append(sb.toString() + " ");
			} else if (m.find()) {
				sb.append(m.group(0) + "ay");
				sb.deleteCharAt(0);
				newsb.append(sb.toString() + " ");
			} else {
				sb.append("way");
				newsb.append(sb.toString() + " ");
			}
		}

		return newsb;
	}

}