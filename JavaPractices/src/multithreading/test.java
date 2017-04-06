package multithreading;
public class test {

		 public static void main(String args[]) throws InterruptedException{  
			  TestSleepMethod1 t1=new TestSleepMethod1();  
			  TestSleepMethod1 t2=new TestSleepMethod1();  
			   
			  t1.start();  			 
			  t1.join();
			  t2.start();  
			  System.out.println(t1.isDaemon());
			  
			 }  


}
