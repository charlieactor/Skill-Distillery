package labs;

public class StateTest {
	public static void main(String[] args) {
		State[] stateArray = new State[6];

		stateArray[0] = makeState("Colorado", "CO", "Denver", 5450000);
		stateArray[1] = makeState("Wyoming", "WY", "Cheyenne", 586000);
		stateArray[2] = makeState("Utah", "UT", "Salt Lake City", 2996000);
		stateArray[3] = makeState("New York", "NY", "Albany", 8491000);
		stateArray[4] = makeState("Vermont", "VT", "Montpellier", 626000);
		stateArray[5] = makeState("California", "CA", "Sacramento", 39000000);

		int highestPop = 0;
		for (int i = 0; i < stateArray.length; i++) {
			if (stateArray[i].getPopulation() > highestPop) {
				highestPop = stateArray[i].getPopulation();
			}
		}
		for (int i = 0; i < stateArray.length; i++) {
			if (highestPop == stateArray[i].getPopulation()) {
				stateArray[i].setBird("California Quail");
//				stateArray[i].display();
				System.out.println(stateArray[i]);
			}
		}
	}
	public static State makeState(String stateName, String stateAbbrev, String capital, int pop) {
		State state = new State(stateName, stateAbbrev, capital, pop);
		return state;
	}
}
