package Object;

public class Bike {
	String name="Duke";
	String color="Orange";

	void speed() {
		System.out.println(130);
	}
	double avg() {
		return 35.00;
	}
	public static void main(String[] args) {
		
		Bike KTM=new Bike();
		
		System.out.println(KTM.name);
		System.out.println(KTM.color);
		KTM.speed();
		System.out.println(KTM.avg());

	}

}
