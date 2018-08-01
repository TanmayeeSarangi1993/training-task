package java8;

interface lamda
{
	public String name(String name1);

}

public class lambda3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		lamda l = (name1)->{
			return "hello" +  name1;
		};
		System.out.println(l.name("tanu"));
			
			
		}

	}

