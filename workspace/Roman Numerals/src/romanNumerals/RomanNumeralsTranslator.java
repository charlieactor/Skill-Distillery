package romanNumerals;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RomanNumeralsTranslator {
    public static void main(String[] args) {
    	Scanner keyboard = new Scanner(System.in);
    	int input;
    	System.out.print("Please enter a number to be converted to Roman Numerals: ");
    	input = keyboard.nextInt();
        System.out.println(translateNumToRomanNumeral(input).toString());
        keyboard.close();
    }

    public static StringBuilder translateNumToRomanNumeral(Integer num) {
        StringBuilder answer = new StringBuilder();
        Map<Integer, String> numeralsMap = new LinkedHashMap<>();
        
        numeralsMap.put(1_000_000, "M\u0305");
        numeralsMap.put(900_000, "C\u0305M\u0305");
        numeralsMap.put(500_000, "D\u0305");
        numeralsMap.put(400_000, "C\u0305D\u0305");
        numeralsMap.put(100_000, "C\u0305");
        numeralsMap.put(90_000, "X\u0305C\u0305");
        numeralsMap.put(50_000, "L\u0305");
        numeralsMap.put(40_000, "X\u0305L\u0305");
        numeralsMap.put(10_000, "X\u0305");
        numeralsMap.put(9000, "I\u0305X\u0305");
        numeralsMap.put(5000, "V\u0305");
        numeralsMap.put(4000, "M\u0305V\u0305");
        numeralsMap.put(1000, "M");
        numeralsMap.put(900, "CM");
        numeralsMap.put(500, "D");
        numeralsMap.put(400, "CD");        
        numeralsMap.put(100, "C");
        numeralsMap.put(90, "XC");
        numeralsMap.put(50, "L");
        numeralsMap.put(40, "XL");
        numeralsMap.put(10, "X");
        numeralsMap.put(9, "IX");
        numeralsMap.put(5, "V");
        numeralsMap.put(4, "IV");
        numeralsMap.put(3, "III");
        numeralsMap.put(2, "II");
        numeralsMap.put(1, "I");

        Set<Integer> numeralsKeys = numeralsMap.keySet();
        Iterator<Integer> it = numeralsKeys.iterator();
        Integer remainingNum = num;

        do {
        INNER: while (it.hasNext()) {
                // System.out.println("In while");
                Integer nextKey = it.next();
                if (nextKey.equals(remainingNum)) {
//                    if(nextKey == remainingNum){
                    answer.append(numeralsMap.get(nextKey));
                    remainingNum -= nextKey;
                    break INNER;
                    // System.out.println("in else");
                    // System.out.println(remainingNum);
                } else if (remainingNum % nextKey != 0) {
                    int numVars = remainingNum / nextKey;
                    remainingNum %= nextKey;
                    for (int i = 0; i < numVars; i++) {
                        answer.append(numeralsMap.get(nextKey));
                    }
                } else if (remainingNum % nextKey == 0) {
                    remainingNum -= nextKey;
                    answer.append(numeralsMap.get(nextKey));
                }
                // remainingNum = remainingNum % nextKey;
                // System.out.println("in else");
//                System.out.println(remainingNum);
            }

        } while (remainingNum > 1);
        return answer;
    }

}