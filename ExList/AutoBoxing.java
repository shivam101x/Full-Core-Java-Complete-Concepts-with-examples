package ExList;

public class AutoBoxing {

	public static void main(String[] args) {
		
		byte b=10;
		short s=20;
		char c='A';
		int n=100;
		long l=12345;
		float f=90.9f;
		double d=23.23;
		boolean bl=true;
		//auto-boxing...
		Byte by=b;
		Short sh=s;
		Character ch=c;
		Integer in=n;
		Long lg=l;
		Float fl=f;
		Double dl=d;
		Boolean bn=bl;    
		
		int a=10;
		Integer in1=a;  //auto-boxing
		
		System.out.println(in1);
	}

}
