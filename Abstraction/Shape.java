package Abstraction;

public abstract class Shape {
	String color;
	
	public abstract double area();
	
	public abstract String toString();
	
	String getColor() {
		
		return color;
	}
}
