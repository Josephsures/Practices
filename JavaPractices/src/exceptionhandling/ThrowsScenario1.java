package exceptionhandling;

import java.io.IOException;

class N {
	void method() throws IOException {
		throw new IOException("device error");
	}
}

public class ThrowsScenario1 {
	public static void main(String args[]) {
		try {
			N n = new N();
			n.method();
		} catch (Exception e) {
			System.out.println("exception handled");
		}

		System.out.println("normal flow...");
	}
}
