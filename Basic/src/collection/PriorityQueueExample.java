package collection;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer>p=new PriorityQueue<Integer>();
		p.add(12);
		p.add(13);
		p.add(14);
		p.add(15);
		p.add(16);
		System.out.println(p);
		System.out.println(p.peek());
		System.out.println(p.poll()); //remove
		System.out.println(p);
		System.out.println(p.element());
		System.out.println(p.remove()); //remove
		System.out.println(p);
		

	

	}

}
