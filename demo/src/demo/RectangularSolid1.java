package demo;

public class RectangularSolid1 {
	double width;
	double height;
	double depth;
	
	RectangularSolid1(double w, double h, double d){
		width = w;
		height = h;
		depth =d;
		
	}
	RectangularSolid1( double length){
		width=height=depth=length;
	}
	
	RectangularSolid1(){
		width=height=depth=10;
	}
	
	double volume() {
		return width*height*depth;
	}

}

class RectangularSolidWeight1 extends RectangularSolid{
	
	double weight;
	
	
	
	RectangularSolidWeight1(double w, double h, double d, double wt){
		super(w,h,d);
		/*width=w;
		height=h;
		depth=d;*/
		weight=wt;
	}
	
	RectangularSolidWeight1(double length, double wt){
		
		super(length);
		weight =wt;
		
	}
	RectangularSolidWeight1(){
		super();
		weight =0;
	}
	

}
