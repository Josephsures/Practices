package exceptionhandling;

public class NumberFormatExample {

	public static void main(String[] args) {
		try{
		String validNumberString ="10";
		String invalidNumberString ="xyz";  
		int j=Integer.parseInt(validNumberString);
		System.out.println(j);
		int i=Integer.parseInt(invalidNumberString);//NumberFormatException
		}
		catch(NumberFormatException e){
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}

}
