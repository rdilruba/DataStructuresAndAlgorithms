package collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLesson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		q.add(5);
		q.offer(4);
		q.offer(19);
		//FIFO
		System.out.println(q.peek()); //prints 5, peek, doesn't remove
		System.out.println(q); // prints [5, 4, 19]

		System.out.println(q.poll()); // prints 5, poll, get&remove
		System.out.println(q);  // prints [4, 19]
		
		Deque<Integer> dq = new LinkedList<>();
		dq.addFirst(12);
		dq.addFirst(13);
		dq.addFirst(14);
		dq.addLast(16);
		// 14 ilk eleman olarak ekleniyor
		// 16 zaten son eleman olarak en sona ekleniyor
		System.out.println(dq);  // prints [14, 13, 12, 16]

	}

}
