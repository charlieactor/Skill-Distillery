package labs;

public class FunPrinter {
	public void printChars(int end) {
		int start = 0x1F600;
		int endIndex = start + end;
		for (int code = 0x1F600; code <= endIndex;) {
			outputChar(code);
			code++;
			if (code % 16 == 0) {
				System.out.println();
			}
		}

	}

	public void outputChar(int code) {
		System.out.print(Character.toChars(code));
	}
}
