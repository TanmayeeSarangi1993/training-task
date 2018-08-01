package java8;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class comparable {
	public static void main(String[] args) {
		 List<String> name1 = new ArrayList<String>();
		 name1.add("Ramu");
		 name1.add("Hari");
		 name1.add("mahesh");
		 name1.add("tanu");
		 
		 comparable cm = new comparable();
		 cm.sort(name1);
		 
		 
 	}

	private void sort(List<String> name1) {
		// TODO Auto-generated method stub
		Collections.sort(name1, new Comparator<String>(){
			public int compare(String s1,String s2) {
				return s1.compareTo(s2);
			}
	});
	
	}
}

