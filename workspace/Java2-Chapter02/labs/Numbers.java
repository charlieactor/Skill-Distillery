package labs;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
	public static void main(String[] args) {
		List<Double> numbers = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			numbers.add(Math.random());
		}
		for (int i = 0; i < numbers.size(); i++) {
			System.out.printf("%.3f%n", numbers.get(i));
		}
		System.out.println();
		System.out.println("Sorted:");
		System.out.println();
		
		
		numbers = doInsertionSort(numbers);
		for (int i = 0; i < numbers.size(); i++) {
			System.out.printf("%.3f%n", numbers.get(i));
		}

	}
    public static List<Double> doInsertionSort(List<Double> input){
        
        double temp;
        for (int i = 1; i < input.size(); i++) {
            for(int j = i ; j > 0 ; j--){
                if(input.get(j) < input.get(j-1)){
                    temp = input.get(j);
                    input.set(j, input.get(j-1));
                    input.set(j-1,  temp);
                }
            }
        }
        return input;
    }
}
