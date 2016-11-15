package fact.queue;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;


/*
A PriorityQueue is what is called a binary heap. It is only ordered/sorted in the sense that the first element is the least. In other word, it only cares about what is in the front of the queue, the rest are "ordered" when needed.

The elements are only ordered as they are dequeued, i.e. removed from the queue using poll(). This is the reason why a PriorityQueue manages to have such good performance, as it is not doing any more sorting than it needs at any time.
 */
public class PriorityQueueTest {

	static class PQsort implements Comparator<Integer> {

		public int compare(Integer one, Integer two) {
			return one - two;
		}
	}

	public static void main(String[] args) {
		int[] ia = { 1, 10, 5, 3, 4, 7, 6, 9, 8 };
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();

		// use offer() method to add elements to the PriorityQueue pq1
		for (int x : ia) {
			pq1.offer(x);
		}

		System.out.println("pq1: " + pq1);

		PQsort pqs = new PQsort();
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(10, pqs);//, Collections.reverseOrder());
		// In this particular case, we can simply use Collections.reverseOrder()
		// instead of self-defined comparator
		for (int x : ia) {
			pq2.offer(x);
		}

		System.out.println("pq2: " + pq2);

		// print size
		System.out.println("size: " + pq2.size());
		// return highest priority element in the queue without removing it
		System.out.println("peek: " + pq2.peek());
		// print size
		System.out.println("size: " + pq2.size());
		// return highest priority element and removes it from the queue
		System.out.println("poll: " + pq2.poll());
		// print size
		System.out.println("size: " + pq2.size());

		System.out.println("pq2: " + pq2);

		pq2.offer(11);
		System.out.println("pq2: " + pq2);
		System.out.println("size: " + pq2.size());
		System.out.println("poll: " + pq2.poll());
		System.out.println("pq2: " + pq2);




	}
}
