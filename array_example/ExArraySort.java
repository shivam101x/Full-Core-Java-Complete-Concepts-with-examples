package array_example;

import java.util.Arrays;
import java.util.Collections;

public class ExArraySort {
	
	static void reverse(Integer arr[]) {
		Arrays.sort(arr);
		Collections.reverse(Arrays.asList(arr));
		System.out.println(Arrays.asList(arr));
//		for (Integer ab : arr) {
//			System.out.println(ab);
//		}
	}
	public static void main(String[] args) {
		
		Integer[] arr= {10,30,50,40,20};
		
		reverse(arr);

	}

}
