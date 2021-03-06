package labs;

public class Month {
	private String monthName, monthAbbreviation;
	private int monthDays;
	
	public Month(String monthName, String monthAbbrev, int monthDays) {
		this.monthName = monthName;
		this.monthAbbreviation = monthAbbrev;
		this.monthDays = monthDays;
	}
	public Month(String monthName, String monthAbbrev, String monthDays) {
		this.monthName = monthName;
		this.monthAbbreviation = monthAbbrev;
		this.monthDays = Integer.parseInt(monthDays);
	}
		
	
	@Override
	public String toString() {
		return "Month [monthName=" + monthName + ", monthAbbreviation=" + monthAbbreviation + ", monthDays=" + monthDays
				+ "]";
	}


	public String getMonthName() {
		return monthName;
	}
	public void setMonthName(String monthName) {
		this.monthName = monthName;
	}
	public String getMonthAbbreviation() {
		return monthAbbreviation;
	}
	public void setMonthAbbreviation(String monthAbbreviation) {
		this.monthAbbreviation = monthAbbreviation;
	}
	public int getMonthDays() {
		return monthDays;
	}
	public void setMonthDays(int monthDays) {
		this.monthDays = monthDays;
	}
	
	
	public void display() {
		System.out.println(monthName + " " + monthDays);
	}
	public void display(boolean detailed) {
		if (detailed == true) {
			System.out.println(monthName + " " + monthAbbreviation + " " + monthDays);
		}
		else {
			System.out.println(monthName);
		}
	}
}
