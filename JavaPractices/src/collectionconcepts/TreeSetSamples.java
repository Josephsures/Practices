package collectionconcepts;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetSamples {

	public static void main(String[] args) {
		Set<String> temp = new HashSet<String>();
		temp.add("honeycomb");
		temp.add("marshmallow");
		temp.add("gingerbread");
		temp.add("donut");
		temp.add("jellybean");
		System.out.println(temp);
		
		Set<String> androidVersions = new TreeSet<String>();
		androidVersions.addAll(temp);
		//Maintains ascending order
		System.out.println(androidVersions);
	}

}
