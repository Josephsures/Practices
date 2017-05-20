package collectionconcepts;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueSamples {

	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul");  
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("iterating the queue elements:");  
		Iterator<String> itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		queue.remove();
		queue.poll();
		queue.offer("jo");
		System.out.println(queue);  
	}

}
