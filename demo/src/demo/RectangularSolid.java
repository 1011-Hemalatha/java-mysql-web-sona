package demo;

public class RectangularSolid {
	double width;
	double height;
	double depth;
	
	RectangularSolid(double w, double height, double d){
		width = w;
		this.height = height;
		depth =d;
		
	}
	RectangularSolid( double length){
		width=height=depth=length;
	}
	
	RectangularSolid(){
		width=height=depth=10;
	}
	
	double volume() {
		return width*height*depth;
	}

}

class RectangularSolidWeight extends RectangularSolid{
	
	double weight;
	RectangularSolidWeight(double w, double h, double d, double wt){
		width=w;
		height=h;
		depth=d;
		weight=wt;
	}
	public RectangularSolidWeight(int i, int j) {
		// TODO Auto-generated constructor stub
	}
	public RectangularSolidWeight() {
		// TODO Auto-generated constructor stub
	}
	
}



class RectangularSolidImpl
{
	public static void main(String args[])
	{
		RectangularSolidWeight r1 = new RectangularSolidWeight(10,20,15,35);
		RectangularSolidWeight r2 = new RectangularSolidWeight(1,2,3,5);
		double volume;
		volume = r1.volume();
		System.out.println("The volume of rectangular block r1 is "+ volume);
		
		volume = r2.volume();
		
		System.out.println("The volume of rectangular block r2 is "+ volume);
		
	}
	
}




