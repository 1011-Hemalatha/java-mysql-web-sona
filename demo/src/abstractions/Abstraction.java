package abstractions;

abstract class Figure{
	double dimension1;
	double dimension2;
	
	Figure(double x, double y){
		dimension1=x;
		dimension2=y;
	}
	
	abstract double area();
}

class Rectangle extends Figure{
	
	Rectangle(double x, double y){
		super(x,y);
	}
	
	double area()
	{
		System.out.println("Area of rectangle is");
		return dimension1*dimension2;
	}
}

class Triangle extends Figure{
	
	Triangle(double x, double y){
		super(x,y);
	}
	
	double area()
	{
		System.out.println("Area of rectangle is");
		return dimension1*dimension2/2;
	}
}



public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Figure figref;
		
		figref = new Rectangle(9,5);
		System.out.println("Area of rectangle is :"+figref.area());
		figref = new Triangle(10,8);
		System.out.println("Area of triangle is :"+figref.area());
		/*
		 * figref = f; System.out.println("Area of superclass is :"+figref.area());
		 */
		

	}


	}

