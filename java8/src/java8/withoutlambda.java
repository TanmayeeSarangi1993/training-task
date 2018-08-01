package java8;

// declaring interface & abstract method
interface Drawable{
	public void draw();
}

public class withoutlambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w = 11;
		
//we are declaring a object for interface
		Drawable d=new Drawable(){
		public void draw()
		{
			System.out.println("drawing" + w);
		}
		 };
 
		d.draw();
	}
}

