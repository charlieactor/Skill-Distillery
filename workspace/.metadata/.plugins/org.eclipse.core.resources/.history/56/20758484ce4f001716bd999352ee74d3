package presidents;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {
	static List<Presidents> presList = new ArrayList<>();

	public static void Reader() {
		BufferedReader bufIn = null;
		try {
			bufIn = new BufferedReader(new FileReader("presidents.csv"));

			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] presArr = line.split(", ");
				Presidents newPres = new Presidents();
				//¯\_(ツ)_/¯
				newPres.setTermNumber(Integer.parseInt(presArr[0]));
				newPres.setFirstName(presArr[1]);
				newPres.setMiddleName(presArr[2] + " ");
				newPres.setLastName(presArr[3]);
				String[] term = presArr[4].split("-");
				newPres.setStartYear(Integer.parseInt(term[0]));
				newPres.setEndYear(Integer.parseInt(term[1]));
				newPres.setParty(presArr[5]);

				presList.add(newPres);

			}
			printPresidents();
			System.out.println();
			List<Presidents> partyList = makePartyList(presList, "Whig");
			for (int i = 0; i < partyList.size(); i++) {
				System.out.println(partyList.get(i));
			}
			System.out.println();
			List<Presidents> middleNameList = makeMiddleNameList(presList);
			for (int i = 0; i < middleNameList.size(); i++){
				System.out.println(middleNameList.get(i));
			}
			System.out.println();
			List<Presidents> lessThanFour = makeTermList(presList);
			for (int i = 0; i < lessThanFour.size(); i++){
				System.out.println(lessThanFour.get(i));
			}
			System.out.println();
			List<Presidents> startsWithR = makeLastNameList(presList, "R");
			for (int i = 0; i < startsWithR.size(); i++){
				System.out.println(startsWithR.get(i));
			}
			System.out.println();
			makeFile(presList, "Whig");
			makeFile(presList, "Independent");
			makeFile(presList, "Federalist");
			makeFile(presList, "Democratic-Republican");
			makeFile(presList, "Democrat");
			makeFile(presList, "Republican");
			
		} catch (IOException e) {
			System.err.println(e);
		} finally {
			if (bufIn != null) {
				try {
					bufIn.close();
				} catch (IOException e) {
					System.err.println(e);
				}
			}
		}
	}

	public static void main(String[] args) {
		Reader();
	}

	public static void printPresidents() {
		for (Presidents president : presList) {
			System.out.println(president);
		}
	}
	
	public static void makeFile(List<Presidents> p, String party) {

		BufferedWriter bw = null;
		FileWriter fw = null;

		try {
			StringBuilder content = new StringBuilder();
			for (int i = 0; i < makePartyList(p, party).size(); i++){
			content.append("\n" + makePartyList(p, party).get(i).getFirstName() + " " + makePartyList(p, party).get(i).getLastName());
			}
			String content2 = content.toString();
			fw = new FileWriter(party);
			bw = new BufferedWriter(fw);
			bw.write(content2);

			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
	}
	
	//Takes an arraylist of presidents and returns an arraylist of presidents of the same party.
	public static List<Presidents> makePartyList(List<Presidents> p, String party) {
		List<Presidents> presParty = new ArrayList<>(); 
		for (int i = 0; i < p.size(); i++) {
			if (presList.get(i).getParty().equals(party)) {
				presParty.add(p.get(i));
			}
		}
		return presParty;
	}
	
	//Takes an arraylist of presidents and returns an arraylist of presidents who dont have middle names
	public static List<Presidents> makeMiddleNameList(List<Presidents> p) {
		List<Presidents> presParty = new ArrayList<>(); 
		for (int i = 0; i < p.size(); i++) {
			if (! presList.get(i).getMiddleName().equals(" ")) {
				presParty.add(p.get(i));
			}
		}
		return presParty;
	}
	
	//Takes arraylist and returns an arraylist of presidents with terms less than 4 years.
	public static List<Presidents> makeTermList(List<Presidents> p) {
		List<President> presParty = new ArrayList<>(); 
		for (int i = 0; i < p.size(); i++) {
			if ((presList.get(i).getEndYear()) - (presList.get(i).getStartYear()) < 4) {
				presParty.add(p.get(i));
			}
		}
		return presParty;
	}
	//Takes arraylist and string and returns arraylist of presidents with last name starting with that key
	public static List<Presidents> makeLastNameList(List<Presidents> p, String key) {
		List<Presidents> presParty = new ArrayList<>(); 
		for (int i = 0; i < p.size(); i++) {
			if ((presList.get(i).getLastName().startsWith(key))) {
				presParty.add(p.get(i));
			}
		}
		return presParty;
	}
}