package programming;

import java.util.*;

public class FP01Structured {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
//		printAllNumbersInListStructured(numbers);
		printEvenNumbersInListStructured(numbers);
	}
	
	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		for(int each : numbers) {
			System.out.println(each);
		}
	}
	
	private static void printEvenNumbersInListStructured(List<Integer> numbers) {
		for(int each : numbers) {
			if(each % 2 == 0) {
				System.out.println(each);
			}
		}
	}
}
