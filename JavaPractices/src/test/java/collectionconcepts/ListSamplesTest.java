package collectionconcepts;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ListSamplesTest {

	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testAddArrayList() {
		ListSamples samples = new ListSamples();
		List<String> resultList = samples.addToArrayList();
		System.out.println(resultList);
		assertNotNull(resultList);
	}

}
