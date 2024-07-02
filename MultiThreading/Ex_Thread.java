package MultiThreading;

public class Ex_Thread extends Thread{
	public Ex_Thread() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		for (int i = 1; i <=10; i++) {
			try {
				sleep(1000);
				
//				System.out.println(currentThread().getId());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}	
	}
	public static void main(String[] args) throws InterruptedException {
		
		Ex_Thread ob=new Ex_Thread();
		Ex_Thread ob1=new Ex_Thread();
//		ThreadGroup g1=new ThreadGroup(ob,"Abc");
		ob.start();
		ob.join(2000);
		
//		ob.setPriority(MAX_PRIORITY);
		ob1.start();
	

	}

}
