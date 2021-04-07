package demo;

class A1{
	
	int money;
	private int pocketmoney;
	
	void fill(int money, int pocketmoney) {
		this.money=money;
		this.pocketmoney=pocketmoney;
	}
	
	public int getPocketmoney()
	{
		return pocketmoney;
	}
}

class B1 extends A1{
	
	int total;
	void sum() {
		total = money +getPocketmoney();
	}
}

class AcessDemo{
	
	public static void main(String[] args) {
		B1 suboj = new B1();
		suboj.fill(122, 200);
		suboj.sum();
		System.out.println(" Total   :"+ suboj.total);
	}
}