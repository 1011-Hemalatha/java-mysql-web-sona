package demo;

public class SuperRefDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectangularSolidWeight rsw = new RectangularSolidWeight(4, 5, 7, 8.0);
		RectangularSolid rs = new RectangularSolid();
		double volume;
		volume = rsw.volume();
		
		System.out.println("volume of rsw is" +volume);
		System.out.println("Weight of rsw is" +rsw.weight);
		rs= rsw;
		volume = rs.volume();
		System.out.println("volume of rs is" +volume);
		//System.out.println("Weight of rs is" +rs.weight);
		RectangularSolidWeight rsw1 = new RectangularSolidWeight();
		System.out.println(" volume 1>>>>"+ rsw1.volume());
		rsw1 = (RectangularSolidWeight) rs;
		System.out.println(" volume 2>>>>"+ rsw1.volume());
		
	}


}
