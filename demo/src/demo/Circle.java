package demo;

public class Circle {
static double pi = 3.14;
	
	public double area(int r) {
		return pi*r*r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Circle c1 = new Circle();
		System.out.println(( "Area of circle 1  "+c1.area(1)));
		Circle c2 = new Circle();
		System.out.println(( "Area of circle 2  "+c2.area(2)));
		Circle c3 = new Circle();
		System.out.println(( "Area of circle 3  "+c3.area(3)));

	}

}
