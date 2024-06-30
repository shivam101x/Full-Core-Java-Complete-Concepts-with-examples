package methods;

public class Car {
	
	String cmp="Tata";
	String modal="Nexon";
	static String clg="MIT";
	
	public int speed(int speed) {
		Car.clg="VIIT";
		return speed;
	}
	public static void main(String[] args) {
		Car car1=new Car();
		
		for (int i = 0; i < 251; i++) {
			int sp=car1.speed(i);
			if(sp==250)
			{
				break;
			}
			System.out.println(sp++);
		}
		System.out.println(clg);

//		int res=Addition.add(2000, 110);
//		System.out.println(res);
	}

}
