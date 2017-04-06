package designpatterns;

public class MySingleton {
 private static MySingleton singleobj = new MySingleton();
 private MySingleton(){}
 
 public static MySingleton getInstance(){
	 
	return singleobj;
	 
 }
 
 public void displayMsg(){
	 System.out.println("Singleton working");
 }
}
