package ExList;

import java.util.LinkedList;
import java.util.function.Predicate;

public class ExLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll=new LinkedList<Integer>();
		LinkedList<Integer> ll1=new LinkedList<Integer>();
		ll1.addFirst(10);
		ll1.addLast(9);
		
		ll.add(0);
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
//		System.out.println(ll.peek());
//		System.out.println(ll.isEmpty());
		ll.remove();
//		System.out.println(ll);
		Predicate<Integer> pr=ab->(ab>3);
		ll.removeIf(pr);
		
		for (Integer integer : ll) {
			System.out.println(integer);
		}
		ll.addAll(ll1);
		
		
//		System.out.println(ll1.element());
//		System.out.println(ll.contains(50));
		
//		for (Integer integer : ll) {
//			System.out.println(integer);
//		}

	}

}
