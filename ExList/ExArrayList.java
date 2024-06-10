package ExList;

import java.io.File;
import java.util.ArrayList;

public class ExArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> al1 = new ArrayList<Integer>();

		for (int i = 0; i < 100; i++) {
			al1.add(i);
		}
		ArrayList<Integer> al2 = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			al2.add(i);
		}
//		for (Integer ab : al) {
//			System.out.println(ab);
//		}
		System.out.println(al1.equals(al2));
	}

}
