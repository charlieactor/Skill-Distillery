package com.skilldistillery.history;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PresidentAppLambda {
	private static final String fileName = "presidents.tsv";
	private List<President> presidents = new ArrayList<>();

	class presComparator implements Comparator<President> {

		public int compare(President p1, President p2) {
			if (p1.getParty().hashCode() > p2.getParty().hashCode()) {
				return 1;
			} else if (p1.getParty().hashCode() < p2.getParty().hashCode()) {
				return -1;
			} else {
				if (p1.getTermNumber() > p2.getTermNumber()) {
					return 1;
				} else if (p1.getTermNumber() < p2.getTermNumber()) {
					return -1;
				} else {
					return 0;
				}
			}
		}

	}

	public static void main(String[] args) {
		PresidentApp app = new PresidentApp();
		PresidentPartyMatcher ppm = new PresidentPartyMatcher();
		com.skilldistillery.history.PresidentApp.firstNameFilter fnm = app.new firstNameFilter();
		app.start();
		System.out.println();
		System.out.println("Sorting by party, then term num:");
		app.printPresidents(app.sortByPartyAndTermNum());
		System.out.println();
		System.out.println("Sorting by Reason left office, then term number:");
		app.printPresidents(app.sortByReasonLeftAndTermNum());
		System.out.println();
		System.out.println("Sorting by last name: ");
		app.printPresidents(app.sortByLastName());
		System.out.println();
		System.out.println("**********");
		System.out.println("Filtered by WHIG");
		app.printPresidents(app.filter("whig", ppm));
		System.out.println();
		System.out.println("**********");
		System.out.println("Filtered by first name starts with:");
		app.printPresidents(app.filter("Joh", fnm));

	}

	public List<President> sortByPartyAndTermNum() {
		presComparator pc = new presComparator();
		List<President> sortedByTerm = new ArrayList<>();
		sortedByTerm = presidents;
		Collections.sort(sortedByTerm, pc);
		return sortedByTerm;
	}



	public void start() {
		this.printPresidents(this.getPresidents());
		System.out.println("SORTING BY TERM END:");
		PresidentMatcher wLOF = ((p, string) -> p.getWhyLeftOffice().toLowerCase().equals(string));
		this.printPresidents(this.filter("Term ended", wLOF));

		System.out.println();
		System.out.println("SORTING BY REASON LEFT, THEN TERM");
		List<President> rLT = new ArrayList<>(presidents);
		Collections.sort(rLT, ((President p1, President p2) -> {
			if (p1.getWhyLeftOffice().hashCode() > p2.getWhyLeftOffice().hashCode()) {
				return 1;
			}
			else if (p1.getWhyLeftOffice().hashCode() < p2.getWhyLeftOffice().hashCode()) {
				return -1;
			}
			else {
				if (p1.getTermNumber() > p2.getTermNumber()) {
					return 1;
				} else if (p1.getTermNumber() < p2.getTermNumber()) {
					return -1;
				} else {
					return 0;
				}
			}
		}

		));
		for (President president : rLT) {
			System.out.println(president);
		}
		

		System.out.println();
		System.out.println("ANONYMOUS CLASSES: ");
		System.out.println("LAST NAMES START WITH C:");
		PresidentMatcher lastNamesC = ((p, string) -> p.getLastName().startsWith(string));
		this.printPresidents(this.filter("C", lastNamesC));
		System.out.println();

		System.out.println("Party name contains \"DEMOCRAT\"");
		PresidentMatcher partyContainsX = ((p, string) -> p.getParty().contains(string));
		this.printPresidents(this.filter("Democrat", partyContainsX));
		System.out.println();

		System.out.println("DIED IN OFFICE:");
		PresidentMatcher diedInOffice = ((p, string) -> p.getWhyLeftOffice().toLowerCase().equals(string));
		this.printPresidents(this.filter("died in office", diedInOffice));
		System.out.println();

		System.out.println("Lost Re-Election");
		PresidentMatcher lostReelection = ((p, string) -> p.getWhyLeftOffice().toLowerCase().equals(string));
		this.printPresidents(this.filter("Lost reelection", lostReelection));
		System.out.println();

		System.out.println("TERMS STARTED IN 19TH CENTURY:");
		PresidentMatcher termStart19thCentury = ((p, string) -> {
			LocalDate testDate = LocalDate.of(1900, 01, 01);
			LocalDate testDate2 = LocalDate.of(1800, 01, 01);
			return (p.getTermBegin().isBefore(testDate) && p.getTermBegin().isAfter(testDate2));
		});

		this.printPresidents(this.filter("1900", termStart19thCentury));
	}

	public PresidentAppLambda() {
		this.loadPresidents(fileName);
	}

	public List<President> getPresidents() {
		return this.presidents;
	}

	public void printPresidents(List<President> pres) {
		for (President p : pres) {
			System.out.println(p);
		}
	}

	public List<President> filter(String string, PresidentMatcher matcher) {
		List<President> filtered = new ArrayList<>();
		for (President p : presidents) {
			if (matcher.matches(p, string)) {
				filtered.add(p);
			}
		}
		return filtered;
	}

	private void loadPresidents(String fileName) {
		// File format (tab-separated):
		// # First Middle Last Inaugurated Left office Elections won Reason left
		// office Party
		// 1 George Washington July 1, 1789 March 4, 1797 2 Did not seek
		// re-election Independent
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String record = reader.readLine(); // Read and discard header line
			while ((record = reader.readLine()) != null) {
				String[] col = record.split("\\t");
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM d, yyyy");

				int term = Integer.parseInt(col[0]);
				String fName = col[1];
				String mName = col[2];
				String lName = col[3];
				LocalDate termBegin = LocalDate.parse(col[4], dtf);
				LocalDate termEnd;
				try {
					termEnd = LocalDate.parse(col[5], dtf);
				} catch (DateTimeParseException dtpe) {
					termEnd = null;
				}
				int won = Integer.parseInt(col[6]);
				String whyLeft = col[7];
				String party = col[8];

				President pres = new President(term, fName, mName, lName, won, whyLeft, party, termBegin, termEnd);
				presidents.add(pres);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.exit(1);
		}
	}
}