package Abstraction;

public class TATA extends Car{

	public static void main(String[] args) {
		
		Car Tata=new TATA();
		Tata.start();

	}

	@Override
	void start() {
		System.out.println("Tata Car is Start..");
	}

}
