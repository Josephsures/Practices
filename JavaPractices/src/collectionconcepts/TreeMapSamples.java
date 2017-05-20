package collectionconcepts;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapSamples {

	public static void main(String[] args) {
		  TreeMap<Double,String> hm=new TreeMap<Double,String>();  
		  //Maintains ascending order for the key
		  hm.put(2.3,"gingerbread");  
		  hm.put(6.0,"marshmallow");  
		  hm.put(4.1,"jellybean");  
		  hm.put(1.6,"donut");  
		  hm.put(3.0,"honeycomb");  
		  for(Map.Entry<Double,String> m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		 }  

}
