package exceptionhandling;

import java.io.IOException;

/**
 * Example for try/Catch with arithmetic exception
 *
 * @author Joseph
 *
 */
public class ArithmeticTryCatch {
	public static void main(String args[]) {
		try {
			int data = 50 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("rest of the code...");
	}

}
