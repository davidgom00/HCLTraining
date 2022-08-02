package pqueueNotes;

import java.util.*;
public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		for(int i = 10; i >0; i--) {
			queue.add(i);
		}
		
		System.out.println(queue);
		System.out.println(queue.size());
		System.out.println(queue.peek());
		queue.poll();
		System.out.println(queue.peek());
		System.out.println("The size of the queue is : " + queue.size());
	}

}
