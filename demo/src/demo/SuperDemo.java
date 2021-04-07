package demo;

public class SuperDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectangularSolidWeight rsw1 = new RectangularSolidWeight(10,20,15,30);
		RectangularSolidWeight rsw2 = new RectangularSolidWeight();
		RectangularSolidWeight rsw3 = new RectangularSolidWeight(3,2);
		
		double volume;
		volume = rsw1.volume();
		System.out.println("Volume of sw1 is   :"+volume);
		System.out.println("Weight oif rsw1 is :"+rsw1.weight);
		
		volume = rsw2.volume();
		System.out.println("Volume of sw1 is   :"+volume);
		System.out.println("Weight oif rsw1 is :"+rsw2.weight);
		
		volume = rsw3.volume();
		System.out.println("Volume of sw1 is   :"+volume);
		System.out.println("Weight oif rsw1 is :"+rsw3.weight);

	}

}
