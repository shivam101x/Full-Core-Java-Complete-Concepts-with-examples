package Abstraction;

public class Circle extends Shape{

	@Override
	public double area() {
		int r=20;
		return Math.PI*r*r;
	}

	@Override
	public String toString() {
		
		return "Area Of Circle ";
	}
	public static void main(String[] args) {
		
		Shape sh=new Circle();
		sh.color="Black";
		System.out.println(sh.toString());
		System.out.println("is :"+sh.area()+" and Color is:"+sh.getColor());
		
		Shape rect=new Rectangle();
		rect.color="Purple";
		System.out.println(rect.toString());
		System.out.println("is :"+rect.area()+" and Color is:"+rect.getColor());
		
	}

}
