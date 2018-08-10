package java8;

import java.util.Arrays;
import java.util.List;

public class array {
	public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(1,2,23,34,5,6);
	numbers.forEach((Integer value) -> System.out.print(value));
	if(Checker.istrue)System.out.println("It Done");
		
	}

}
