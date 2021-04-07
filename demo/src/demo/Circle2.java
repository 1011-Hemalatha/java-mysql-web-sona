package demo;

public class Circle2 {
static double pi = 3.14;
	
	public double area(int r) {
		return pi*r*r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Circle2 c1 = new Circle2();
		System.out.println(( "Area of circle 1  "+c1.area(1)));
		Circle2 c2 = new Circle2();
		System.out.println(( "Area of circle 2  "+c2.area(2)));
		Circle2 c3 = new Circle2();
		System.out.println(( "Area of circle 3  "+c3.area(3)));
		System.gc();
		System.out.println("No empty objects");
		c1= null;
		
		System.gc();
		System.out.println("We have empty objects");
		
		
		System.out.println(( "Area of circle 2  "+c2.area(2)));
	
		System.out.println(( "Area of circle 3  "+c3.area(3)));
		

	}
	
	public void finalize() {
		System.out.println(" finalize method overriden");
	}

}
