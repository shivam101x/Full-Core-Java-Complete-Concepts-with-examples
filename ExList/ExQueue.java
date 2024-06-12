package ExList;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class ExQueue {

	public static void main(String[] args) {
		Queue<Integer> pq=new PriorityQueue<>();
		for (int i = 1; i <=10; i++) {
			pq.add(i);
		}
		Queue<Integer> pq1=new PriorityQueue<>();
		for (int i = 101; i <=110; i++) {
			pq1.add(i);
		}
		
			System.out.println(pq);
//			pq.remove();
			
			pq1.remove();
			pq1.add(1);
			System.out.println(pq1);
			System.out.println(Collections.disjoint(pq, pq1));
			
		
		
	}

}
