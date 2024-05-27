package array_example;

public class Array_Reverse {
	
	static void reverse(int[] arr,int len) {
		int tem[]=new int[len];
		
		int j=len;
		for (int i = 0; i < len; i++) {
			tem[j-1]=arr[i];
			j=j-1;
		}
		System.out.print("\nAfter: ");
		for (int i = 0; i < tem.length; i++) {
			System.out.print(tem[i]+" ");
		}	
	}
	public static void main(String[] args) {
		int arr[]= {5,9,1,3,4,2,7,6,8,10};
		System.out.print("Before: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		reverse(arr,arr.length);
	}

}
