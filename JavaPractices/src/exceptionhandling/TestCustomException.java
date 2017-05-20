package exceptionhandling;

class TestCustomException{  
	  
	   static void validate(int age)throws InvalidAgeException{  
	     if(age<18)  
	      throw new InvalidAgeException("User is not eligible to vote");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	     
	   public static void main(String args[]){  
	      try{  
	      validate(13);  
	      }catch(Exception m){System.out.println(m);}  
	  
	      System.out.println("rest of the code...");  
	  }  
	} 
