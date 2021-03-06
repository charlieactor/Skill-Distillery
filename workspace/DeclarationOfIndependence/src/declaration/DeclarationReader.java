package declaration;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DeclarationReader {
	public static void main(String[] args){
		try (BufferedReader bufIn = 
					new BufferedReader(new FileReader("usdeclar.txt"))){
			String line;
			
			int characterCount = 0;
			int lineCount = 0;
			int wordCount = 0;
            while ((line = bufIn.readLine()) != null) {
                System.out.println(line);
                lineCount++;
                characterCount+=line.length();
                }
		
            System.out.println();
            System.out.println("Line count: " + lineCount);
            System.out.println("Character count: " + characterCount);
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ioe) {
			
		}
		
		
	}
}
