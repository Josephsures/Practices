package collectionconcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapSamples {

	public static void main(String[] args) {
		  Map<Integer,String> map=new HashMap<Integer,String>(); 
		  map.put(100,"Amit");  
		  map.put(101,"Vijay");  
		  map.put(102,"Rahul");  
		  // It does not maintain any order
		  for(Map.Entry<Integer,String> m:map.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		  map.put(null, "jo");
		  // Does not allow duplicate key
		  map.put(null, "jo");
		  // Allows duplicate value
		  map.put(104, "jo");
		  // Allows Multiple null values
		  map.put(105, null);
		  map.put(103, null);
		  System.out.println("****************************");
		  //Traversing Map  with set
		    Set<Entry<Integer, String>> set=map.entrySet();//Converting to Set so that we can traverse  
		    Iterator<Entry<Integer, String>> itr=set.iterator();  
		    while(itr.hasNext()){  
		        //Converting to Map.Entry so that we can get key and value separately  
		        Map.Entry<Integer,String> entry=(Map.Entry<Integer,String>)itr.next();  
		        System.out.println(entry.getKey()+" "+entry.getValue());  
		    }  
		    System.out.println( map.values());
	}

}
