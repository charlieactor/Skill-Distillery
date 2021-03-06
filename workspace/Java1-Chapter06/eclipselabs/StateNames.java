package eclipselabs;

import java.util.Scanner;

public class StateNames {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String entry, again;
		String stateNames[][] = { { "Utah", "Salt Lake City" }, { "Colorado", "Denver" },
				{ "California", "Sacramento" }, { "Iowa", "Des Moines" }, { "New York", "Albany" },
				{ "Georgia", "Atlanta" }, { "Idaho", "Boise" }, { "Wyoming", "Cheyenne" },
				{ "Missouri", "Jefferson City" }, { "Illinois", "Springfield" }, { "Alabama", "Montgomery" },
				{ "Alaska", "Juneau" }, { "Arizona", "Phoenix" }, { "Connecticut", "Hartford" },
				{ "Delaware", "Dover" }, { "Florida", "Tallahasee" }, { "Georgia", "Atlanta" },
				{ "Hawaii", "Honolulu" }, { "Kansas", "Topeka" }, { "Kentucky", "Frankfort" },
				{ "Louisiana", "Baton Rouge" }, { "Maine", "Augusta" }, { "Maryland", "Annapolis" },
				{ "Massachusetts", "Boston" }, { "Michigan", "Lansing" }, { "Minnesota", "St. Paul" },
				{ "Mississippi", "Jackson" }, { "Montana", "Helsing" }, { "Nebraska", "Lincoln" },
				{ "Nevada", "Carson City" }, { "New Hampshire", "Concord" }, { "New Jersey", "Trenton" },
				{ "New Mexico", "Santa Fe" }, { "North Carolina", "Raleigh" }, { "North Dakota", "Bismarck" },
				{ "Ohio", "Colombus" }, { "Oklahoma", "Oklahoma City" }, { "Oregon", "Salem" },
				{ "Pennsylvania", "Harrisburg" }, { "Rhode Island", "Providence" }, { "South Carolina", "Columbia" },
				{ "South Dakota", "Pierre" }, { "Tennessee", "Nashville" }, { "Texas", "Austin" },
				{ "Vermont", "Montpellier" }, { "Virginia", "Richmond" }, { "Washington", "Olympia" },
				{ "West Virginia", "Charleston" }, { "Wisconsin", "Madison" } };

		do {
			System.out.println("Type the beginning of a state's name to see it's capital: ");
			keyboard.nextLine();
			entry = keyboard.nextLine();
			for (int i = 0; i < stateNames.length; i++) {
				for (int q = 0; q < stateNames[i].length; q++) {
					if (stateNames[i][0].startsWith(entry)) {
						System.out.print(stateNames[i][0] + ": ");
						System.out.println(stateNames[i][1]);
						break;
					}
				}
			}
			System.out.println("Would you like to go again (Y)?: ");
			again = keyboard.next();
		} while (again.equals("Y") || again.equals("y"));
		keyboard.close();
	}
}
