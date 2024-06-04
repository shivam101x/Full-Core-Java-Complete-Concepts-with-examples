package Ex_Keywords;

public class Ex_Final {
	
	final int p_code;
	String p_name;
	public Ex_Final(int p_code, String p_name) {
		super();
		this.p_code = p_code;
		this.p_name = p_name;
	}

	public static void main(String[] args) {
		Ex_Final ob=new Ex_Final(10001, "ABC");
		System.out.println(ob.p_code+" "+ob.p_name);
	}

}
