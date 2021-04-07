package demo;

class X{
	X(){
		System.out.println("Inside X constructor");
	}
}

class Y extends X{
	Y(){
		System.out.println("inside Y Constructor");
	}
}

class Z extends Y{
	
	Z(){
		System.out.println("Inside Z constructor");
	}
}

public class OrderOfInvocationConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Z z = new Z();

	}

}
