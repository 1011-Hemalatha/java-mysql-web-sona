package demo;

public class Constuct {
	int a,b;
	//default constructor has no parameters
	public Constuct()
	{
		System.out.println("I am inside constuctor");
	}
	public Constuct(int a, int b)
	{
		this.a = a;
		this.b =b;
	}

	
		
public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Constuct cs = new Constuct(2,3);
			System.out.println("a>>>>"+cs.a);
			System.out.println("b>>>>"+cs.b);

		}


	}


