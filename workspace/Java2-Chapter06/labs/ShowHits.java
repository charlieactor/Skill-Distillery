package labs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class ShowHits{
	public void showTheHits(){

	{
		try (BufferedReader bufIn = new BufferedReader(new FileReader("access_log"))) {
			List<String> userHits = new ArrayList<>();

			String line = bufIn.readLine();
			while ((line = bufIn.readLine()) != null) {
				String[] hits = line.split(" - - ");
				userHits.add(hits[0]);
			}
			Collections.sort(userHits);
			Map<Integer, String> visits = new HashMap<>();
			
			int userCount = 1;
			for (int i = 0; i < userHits.size() - 1; i++){
				if (i==(userHits.size() - 2)){
					String userCountString = userHits.get(i) + " has visited " + userCount + " times";
					visits.put(userCount, userHits.get(i));
					System.out.println(userCountString);
					userCount = 1;
				}
				else if (userHits.get(i).equals(userHits.get(i+1))){
					userCount++;
				}
				else {
					String userCountString = userHits.get(i) + " has visited " + userCount + " times";
					visits.put(userCount, userHits.get(i));
					System.out.println(userCountString);
					userCount=1;
				}
			}
			System.out.println();
			Set<Integer> numVisits = visits.keySet();
			Iterator<Integer> it = numVisits.iterator();
			while (it.hasNext()) {
				Integer nextKey = it.next();
				System.out.println("" + nextKey + " visits from " + visits.get(nextKey));
			}
//			System.out.println(userHits);

		} catch (IOException ioe) {
			System.out.println(ioe);
		}
	}
}
}
