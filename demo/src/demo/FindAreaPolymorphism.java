package demo;

class figure{
	double dimension1;
	double dimension2;
	
	figure(double x, double y){
		dimension1=x;
		dimension2=y;
	}
	double area() {
		System.out.println("Area method is not defined");
		return 0;
	}
}

class rectangle extends figure{
	
	rectangle(double x, double y, int i){
		super(x,y);
	}

	double area()
	{
		System.out.println("Area of rectangle is");
		return dimension1*dimension2;
	}
}

class triangle extends figure{
	
	triangle(double x, double y){
		super(x,y);
	}
	
	double area()
	{
		System.out.println("Area of rectangle is");
		return dimension1*dimension2/2;
	}
}


public class FindAreaPolymorphism {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		figure F = new figure(10,10);
		
		figure figreF;
		
		figreF = new rectangle(9,5,6);
		System.out.println("Area of rectangle is :"+figreF.area());
		figreF = new triangle(10,8);
		System.out.println("Area of triangle is :"+figreF.area());
		figreF = F;
		System.out.println("Area of superclass is :"+figreF.area());
		

	}

}
