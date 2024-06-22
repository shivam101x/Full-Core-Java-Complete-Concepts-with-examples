package ExInterfaces;

public class Car implements VehicalTypes{
	static String name;
	public int speed() {
		return 200;
	}
	public  String start() {
		return name+" Started...";
	}
	public String stop() {
		return name+" Stopped..";
	}
	public String vtype() {
		return name+" type is SUV";
	}
	public static void main(String[] args) {
		
		VehicalTypes Safari=new Car();
		name="Safari";
		System.out.println(Vehical);
		System.out.println("Name is "+name);
		System.out.println(Safari.vtype());
		System.out.println(Safari.start());
		System.out.println(name+" speed is "+Safari.speed());
		System.out.println(Safari.stop());
		
	}

}
