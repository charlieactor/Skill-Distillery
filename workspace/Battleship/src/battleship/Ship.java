package battleship;

public class Ship {
	private int length, numHits;
	private String name;
	
	Ship(String name, int length, int numHits) {
		this.name = name;
		this.length = length;
		this.numHits = numHits;
	}

	Ship() {
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getNumHits() {
		return numHits;
	}
	
	public void setNumHits(int numHits) {
		this.numHits = numHits;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Ship [length=" + length + ", numHits=" + numHits + ", name=" + name + "]";
	}
	
}
