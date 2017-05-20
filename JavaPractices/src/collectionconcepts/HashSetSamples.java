package collectionconcepts;

import java.util.HashSet;
import java.util.Set;

public class HashSetSamples {

	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<Integer>();
		numbers.add(1);
		//Does not allow duplicate value
		numbers.add(1);
		numbers.add(2);
		numbers.add(null);
		System.out.println(numbers);
	}

}
