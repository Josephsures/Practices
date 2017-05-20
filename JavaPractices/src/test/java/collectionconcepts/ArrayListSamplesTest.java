package collectionconcepts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ArrayListSamplesTest {

	List<String> arrayList;
	@Before
	public void setUp() throws Exception {
		ArrayListSamples samples = new ArrayListSamples();
		arrayList = samples.addToArrayList();
	}

	@Test
	public void testAddArrayList() {
		System.out.println("Added arraylist:"+arrayList);
		assertNotNull(arrayList);
	}
	
	@Test
	public void testSortArrayList(){
		ArrayListSamples samples = new ArrayListSamples();
		List<String> sortedArrayList = samples.sortArrayList(arrayList);
		System.out.println("Sorted Arraylist:"+sortedArrayList);
		assertNotNull(sortedArrayList);		
	}
	
	@Test
	public void testArrayListSize(){
		System.out.println(arrayList.size());
		assertEquals(4,arrayList.size());
	}
	
	@Test
	public void testSortArrayListDescending(){
		ArrayListSamples samples = new ArrayListSamples();
		List<String> sortedArrayList = samples.sortArrayListDescending(arrayList);
		System.out.println("Sorted Arraylist descending:"+sortedArrayList);
		assertNotNull(sortedArrayList);
	}
	
	@Test
	public void testIterateArrayList(){
		ArrayListSamples samples = new ArrayListSamples();
		  ArrayList<Integer> arrayList = new ArrayList<Integer>();
		  arrayList.add(14);
		  arrayList.add(7);
		  arrayList.add(39);
		  arrayList.add(40);
		samples.waysToIterateArrayList(arrayList);
	}
	
	@Test
	public void testAppendArrayList(){
		ArrayListSamples samples = new ArrayListSamples();
		List<String> newList = new ArrayList<>();
		newList.add("Datson");
		newList.add("Nissan");
		List<String> newarrayList = samples.appendToArrayList(arrayList,newList);
		System.out.println(newarrayList);
	}
	
	@Test
	public void testRemoveArrayList(){
		ArrayListSamples samples = new ArrayListSamples();
		List<String> updatedList = samples.removeFromArrayList(arrayList,"BMW");
		System.out.println(updatedList);
	}

}
