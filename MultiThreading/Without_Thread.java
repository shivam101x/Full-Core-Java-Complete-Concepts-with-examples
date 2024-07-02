package MultiThreading;

public class Without_Thread{
	
	
	public void run() {
		for (int i = 1; i <=10; i++) {
			
			System.out.println(i);
		}	
	}
	public static void main(String[] args) {
		
		Without_Thread ob=new Without_Thread();
		Without_Thread ob1=new Without_Thread();
		ob.run();
		ob1.run();

	}

}
