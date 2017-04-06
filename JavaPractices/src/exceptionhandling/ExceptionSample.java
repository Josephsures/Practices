package exceptionhandling;
import java.io.IOException;

class M{  
 void method()throws ArithmeticException{  
	 int data=50/0;
	 System.out.println("rest of the code...");
 }  
}  
public class ExceptionSample{  
   public static void main(String args[]){  
	   try{  
		      int data=50/0;  
		   }catch(ArithmeticException e){System.out.println(e);}  
		   System.out.println("rest of the code...");
	   M m= new M();
	   m.method();
	}    
   
   
  }  
  
