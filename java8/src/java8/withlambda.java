package java8;

interface drawable{
	public void draw();
}
public class withlambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int w = 3;
  drawable d = () -> {
	  System.out.println("draw" + w);
  };
  
d.draw();

}
}
