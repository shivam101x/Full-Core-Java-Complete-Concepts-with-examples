package Abstraction;

public class Honda extends Car{

	public static void main(String[] args) {
		
		Car honda=new Honda();
		honda.start();
	}

	@Override
	void start() {
		System.out.println("Honda Car is Start..");
		
	}

}
