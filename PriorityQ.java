package sample;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQ {
	
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(20);
		pq.add(40);
		pq.add(10);
		pq.add(30);
		
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.peek());
		
		PriorityQueue<Integer> pqDesc = new PriorityQueue<>(Collections.reverseOrder());
		
		pqDesc.add(10);
		pqDesc.add(5);
		pqDesc.add(20);
		pqDesc.add(15);
		System.out.println(pqDesc);
		System.out.println(pqDesc.poll());
		System.out.println(pqDesc.peek());
		
	}

}
