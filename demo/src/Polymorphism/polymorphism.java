package Polymorphism;

class X{

	int a,b;
	
	
	X(){
		
	}
	X(int a,int n)
	{
		this.a =a;
		b=n;
		
	}
	void display(){
		System.out.println(" a and b are :"+a+"  "+b);
	}
}

class Y extends X{
	int c;
	
	Y(int m, int n, int o){
		super(m,n);
		c=o;
	}
	
	void display(String msg) {
		
		System.out.println(msg+c);
	}
}



public class polymorphism {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Y subOb = new Y(4,5,6);
		subOb.display("This is c:");
		subOb.display();
		
	}

}
