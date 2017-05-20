package exceptionhandling;

public class NullPointerExample {
	public static void main(String args[]) {
		try {
			String s=null;  
			System.out.println(s.length());//NullPointerException  
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		System.out.println("rest of the code...");
	}
}
