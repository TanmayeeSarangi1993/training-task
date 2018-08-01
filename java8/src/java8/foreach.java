package java8;

import java.util.ArrayList;

public class foreach {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("ramu");
		list.add("raja");
		list.add("ramesh");
		list.add("rima");
		
		list.forEach(
				(n) -> System.out.println(n)
						);
			}

}
