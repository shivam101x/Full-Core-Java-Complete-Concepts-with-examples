package Abstraction;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
		
	}
	
	public static void main(String[] args) {
		
		Animal dog=new Dog("Puppy");
		String dname="puppy2";
		System.out.println(dname);
	}

	

}
