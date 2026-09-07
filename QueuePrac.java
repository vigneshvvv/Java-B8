package sample;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePrac {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		
		System.out.println(queue.peek());
//		int a = queue.poll();
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.size());
		System.out.println(queue.contains(20));
		queue.clear();
		System.out.println(queue.isEmpty());

	}

}
