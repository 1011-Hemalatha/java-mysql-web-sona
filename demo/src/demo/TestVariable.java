package demo;

public class TestVariable {
	
		int x;
		
		void setx(int x){
			this.x=x;
		}
		
		int getx(){
			return x;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestVariable t1 = new TestVariable();
		t1.setx(3);
		System.out.println(t1.getx());
	}


	}


