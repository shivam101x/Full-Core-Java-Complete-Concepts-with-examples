package array_example;

import java.util.Iterator;
import java.util.Scanner;

public class Ex_Matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [][]matrix1= new int[2][2];
		System.out.println("Enter Matrix 1 Value");
		for (int i = 0; i < matrix1.length; i++) {
			
			for (int j = 0; j < matrix1.length; j++) {
				matrix1[i][j]=sc.nextInt();
			}
		}
		int [][]matrix2= new int[2][2];
		System.out.println("Enter Matrix 2 Value");
		for (int i = 0; i < matrix2.length; i++) {
			
			for (int j = 0; j < matrix2.length; j++) {
				matrix2[i][j]=sc.nextInt();
			}
		}
		int [][]out= new int[2][2];//3 row 3 col
	
		for (int i = 0; i < out.length; i++) {
			for (int j = 0; j < out.length; j++) {
				
				
				out[i][j]=matrix1[i][j]+matrix2[i][j];
				
				System.out.print(out[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
//		
//		int arr[][][]=new int[2][2][2]; //2*2*2=8
//		
//		arr[0][0][0]=10;
//		arr[0][0][1]=20;
//		arr[0][1][0]=30;
//		arr[0][1][1]=40;
//		arr[1][0][0]=50;
//		arr[1][0][1]=60;
//		arr[1][1][0]=70;
//		arr[1][1][1]=80;
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				for (int j2 = 0; j2 < arr.length; j2++) {
//					System.out.print(arr[i][j][j2]+" ");
//				}
//				System.out.println();
//			}
//		}

	}

}
