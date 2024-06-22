package Exception;

public class RuntimeException {

	public static void main(String[] args) {
		
		try {
			int a=10;
			int b=0;
			System.out.println("Hello");
//			System.out.println(a/b);
			String ab=null;
			
//			System.out.println(ab.length());
			int arr[]= {1,2,3,4,5};
			for (int i = 0; i <=arr.length; i++) {
				System.out.println(arr[i]);
			}
		
		} catch (Exception e) {
			e.printStackTrace();
//			System.out.println(e.toString());
		}
	}

}
