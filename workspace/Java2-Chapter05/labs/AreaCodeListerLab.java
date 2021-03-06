package labs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AreaCodeListerLab {
    private Map<String, String> areaCodes;
    private Map<String, String> abbreviations;

    public AreaCodeListerLab() {
        populateAreaCodes();
        populateAbbreviations();
        print();
    }

    private void populateAreaCodes() {
        areaCodes = new TreeMap<>();

        try (BufferedReader in = new BufferedReader(new FileReader(
                "areacodes.txt"))) {
        	String line;
            while ((line = in.readLine()) != null) {
//                System.out.println(line);
                String[] areaCodesArr = line.split("\\s");
                areaCodes.put(areaCodesArr[0], areaCodesArr[1]);
                // Add code to parse out the area code and abbreviation 
                // from each line.  Then add them to the areaCodes Map.
            }
          
        }
        catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }
    }

    private void populateAbbreviations() {
        abbreviations = new TreeMap<>();

        try (BufferedReader in = new BufferedReader(new FileReader(
                "abbreviations.txt"))) {

            String line = null;
            while ((line = in.readLine()) != null) {
//                System.out.println(line);
                String[] abbreviationsArr = line.split("\t");
                abbreviations.put(abbreviationsArr[1], abbreviationsArr[0]);
                // Add code to parse out the state and abbreviation 
                // from each line.  Then add them to the abbreviations
                // Map.
            }
        }
        catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }
    }

    private void print() {
    	  Set<String> codes = areaCodes.keySet();
          Iterator<String> it = codes.iterator();
          while(it.hasNext()){
          	String thisCode = it.next();
          	String abbrev = areaCodes.get(thisCode);
          	System.out.println(thisCode + " " + abbreviations.get(abbrev));
          }
    }

    public static void main(String[] args) {
        new AreaCodeListerLab();
    }
}
