package collectionconcepts;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListSamples {
	
	public static void main(String[] args) {
		List<String> cars = new LinkedList<String>(); 
		cars.add("polo");
		cars.add("i20");
		cars.add(1, "baleno"); 
		ListIterator<String> listIterator= cars.listIterator(); 
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		//Reverse order
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		cars.add("i20"); //allows duplicate
		System.out.println(cars);
		cars.remove(3);
		System.out.println(cars);
		cars.clear(); // clears the entire list
		System.out.println(cars);
	}

}
