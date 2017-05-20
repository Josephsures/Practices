package collectionconcepts;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetSamples {

	public static void main(String[] args) {
		LinkedHashSet<String> brands = new LinkedHashSet<String>();
		brands.add("lenova");
		brands.add("hp");
		Iterator<String> itr = brands.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
