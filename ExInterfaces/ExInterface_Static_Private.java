package ExInterfaces;


interface A{
	 static void stat() {
		System.out.println("this is static method");
		hide();
	}
	 private void privatemeth() {
		 System.out.println("this is private method");
	 }
	 private static void hide() {
		 System.out.println("this is private static method");
	 }
	 default void show() {
		 privatemeth();
	 }
}
public class ExInterface_Static_Private implements A{

	public static void main(String[] args) {
		ExInterface_Static_Private ob=new ExInterface_Static_Private();
		A.stat();
		ob.show();
	}
	
}
