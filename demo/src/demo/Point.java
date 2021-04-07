package demo;

public class Point {
	int X;
	int Y;

	void setX(int x) {
		
		X= (x > 79 ? 79 : (x < 0 ? 0 : x));
		
	}

	void setY(int y) {
		Y = (y > 24 ? 24 : (y < 0 ? 0 : y));
	}

	int getX() {
		return X;
	}

	int getY() {
		return Y;
	}
	
	public static void main(String args[]) {
		int a,b;
		
		Point p1 = new Point();
		p1.setX(-2);
		p1.setY(44);
		System.out.println("p1.getX()  "+ p1.getX());
		a = p1.getX();
		System.out.println("The value of a is"+a);
		b = p1.getY();
		System.out.println("The value of b is"+b);
		
	}

}



