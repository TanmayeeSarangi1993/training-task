package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class java8comparable {
 public static void main(String[] args) {
	ArrayList<String> list = new  ArrayList<String>();
	
	list.add("tanu");
	list.add("tanu2");
	list.add("tanu3");
	list.add("tanu4");
	
	 java8comparable cm = new  java8comparable();
	 cm.sort(list);
}

private void sort(ArrayList<String> list) {
	// TODO Auto-generated method stub
	Collections.sort(list, (s1 , s2) -> s1.compareTo (s2) );
}
}
