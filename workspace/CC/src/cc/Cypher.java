package cc;

public class Cypher {
	String e, word;
	int shift;

	public Cypher(String e, String word, int shift) {
		setE(e);
		setWord(word);
		setShift(shift);
	}
	
	public void encrypt() {
		int[] encryption = new int[word.length()];
		if (e.charAt(0) == 'e' || e.charAt(0) == 'E') {
			for (int i = 0; i < word.length(); i++) {
				encryption[i] = (int) (word.charAt(i)) + shift;
				if(encryption[i]>122){
					encryption[i]-=26;
				}
			}
			for (int i = 0; i < word.length(); i++) {
				System.out.print((char) encryption[i]);
			}

		} else if (e.charAt(0) == 'd' || e.charAt(0) == 'D') {
			for (int i = 0; i < word.length(); i++) {
				encryption[i] = (int) (word.charAt(i)) - shift;
				if(encryption[i]<97){
					encryption[i]+=26;
				}
			}
			for (int i = 0; i < word.length(); i++) {
				System.out.print((char) encryption[i]);
			}
		}
		
		else {
			System.out.println("Please enter D or E....");
		} while (!(e.equalsIgnoreCase("e")) && (!(e.equalsIgnoreCase("D"))));
		
	}
	
	public String getE() {
		return e;
	}

	public void setE(String e) {
		this.e = e;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getShift() {
		return shift;
	}

	public void setShift(int shift) {
		this.shift = shift;
	}

	
}