package demo;

class A{
int m,n;
	
	
	void display() {
		System.out.println("m and n are "+m+"   "+n);
	}
}

class B extends A{
	
	int c;
	public int m;
	
	void display2() {
		System.out.println("c : "+c);
	}
	
	void sum()
	{
		System.out.println("  m+n+ c "+(m+n+c));
	}

	public void display() {
		// TODO Auto-generated method stub
		
	}
}

class InheritanceDemo{
	
	public static void main(String[] args)
	{
		A s1 = new A();
		B s2 = new B();
		
		s1.m=10; s1.n=20;
		System.out.println("State of Object A.");
		s1.display();
		
		s2.m=55;s2.n=40;s2.c=3;
		System.out.println("State of Object B");
		s2.display();
		s2.display2();
		System.out.println("sum of m,,n and c in object B is");
		s2.sum();
	}
	
}


