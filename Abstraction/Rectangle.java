package Abstraction;

public class Rectangle extends Shape{

	@Override
	public double area() {
		int len=200,width=150;
		return len*width;
	}

	@Override
	public String toString() {
		
		return "Area Of Reactangle";
	}

}
