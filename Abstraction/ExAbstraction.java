package Abstraction;
abstract class Bank{
	abstract int bal();
}
class SBI extends Bank{
	@Override
	int bal() {
		// TODO Auto-generated method stub
		return 500000;
	}
	
}
class ICICI extends Bank{
	@Override
	int bal() {
		// TODO Auto-generated method stub
		return 400000;
	}
	
}
public class ExAbstraction{
	
	public static void main(String[] args) {
		Bank bk;
		bk=new SBI();
		System.out.println("SBI: "+bk.bal());
		bk=new SBI();
		System.out.println("ICICI: "+bk.bal());
	}
}


