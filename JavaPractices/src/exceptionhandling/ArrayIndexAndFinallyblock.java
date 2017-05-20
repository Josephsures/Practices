package exceptionhandling;

public class ArrayIndexAndFinallyblock {

	public static void main(String[] args) {	
		try{
		int a[]=new int[5];  
		a[10]=50; //ArrayIndexOutOfBoundsException
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		finally{
			System.out.println("finally block executed");
		}
		System.out.println("rest of the code");
	}

}
