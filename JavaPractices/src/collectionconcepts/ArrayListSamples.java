package collectionconcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListSamples {

	public List<String> addToArrayList() {
		List<String> carBrands = new ArrayList<>();
		carBrands.add("Ford");
		carBrands.add("BMW");
		carBrands.add("Audi");
		carBrands.add("Maruti");
		return carBrands;
	}

	public List<String> sortArrayList(List<String> list) {
		Collections.sort(list);
		return list;
	}

	public List<String> sortArrayListDescending(List<String> arrayList) {
		Collections.sort(arrayList, Collections.reverseOrder());
		return arrayList;
	}

	public void waysToIterateArrayList(List<Integer> arrlist) {
		/* For Loop for iterating ArrayList */
		System.out.println("For Loop");
		for (int counter = 0; counter < arrlist.size(); counter++) {
			System.out.println(arrlist.get(counter));
		}

		/* Advanced For Loop */
		System.out.println("Advanced For Loop");
		for (Integer num : arrlist) {
			System.out.println(num);
		}

		/* While Loop for iterating ArrayList */
		System.out.println("While Loop");
		int count = 0;
		while (arrlist.size() > count) {
			System.out.println(arrlist.get(count));
			count++;
		}

		/* Looping Array List using Iterator */
		System.out.println("Iterator");
		Iterator<Integer> iter = arrlist.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	public List<String> appendToArrayList(List<String> arrayList, List<String> newList) {
		arrayList.addAll(newList);
		return arrayList;
	}

	public List<String> removeFromArrayList(List<String> arrayList, String string) {
		arrayList.remove(string);
		return arrayList;
	}

}
