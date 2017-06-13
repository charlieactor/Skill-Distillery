package labs;

public class MonthTest {
	public static void main(String[] args) {
		Month[] monthArray = new Month[12];

//		DEFINE THE MONTHS BY NAME: 
//		
		Month january = new Month("January", "Jan", "31");
		Month february = new Month("February", "Feb", "28");
		Month march = new Month("March", "Mar", 31);
		Month april = new Month("April", "Apr", 30);
		Month may = new Month("May", "May", 31);
		Month june = new Month("June", "Jun", 30);
		Month july = new Month("July", "Jul", 31);
		Month august = new Month("August", "Aug", 31);
		Month september = new Month("September", "Sep", 30);
		Month october = new Month("October", "Oct", 31);
		Month november = new Month("November", "Nov", 30);
		Month december = new Month("December", "Dec", 31);

		
		monthArray[0] = january;
		monthArray[1] = february;
		monthArray[2] = march;
		monthArray[3] = april;
		monthArray[4] = may;
		monthArray[5] = june;
		monthArray[6] = july;
		monthArray[7] = august;
		monthArray[8] = september;
		monthArray[9] = october;
		monthArray[10] = november;
		monthArray[11] = december;
		
		int sum = 0;
		for (int i = 0; i < monthArray.length; i++) {
//			monthArray[i].display(true);
			System.out.println(monthArray[i]);
			sum += monthArray[i].getMonthDays();
		}
		System.out.println("\nTotal days: " + sum);
	}

}
