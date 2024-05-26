package array_example;

import java.util.Arrays;
import java.util.Collections;

public class Ex_Array {

	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,4,5};
		
		Integer arr[]={20,30,40,50,10,5};   //5 is length of array
		Arrays.sort(arr);
//		arr1=arr.clone();
		
//		Arrays.sort(arr);
		Collections.reverse(Arrays.asList(arr));
		System.out.println(Arrays.asList(arr));
		
//		for (int i = 0; i < arr.length; i++) {
//			
//		
//			System.out.println(arr[i]);
////			System.out.println(arr1[i]);
//		}
		
		
	}

}
