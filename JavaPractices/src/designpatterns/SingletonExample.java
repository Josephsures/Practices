package designpatterns;

public class SingletonExample {

	public static void main(String[] args) {
		MySingleton obj1 = MySingleton.getInstance();
		obj1.displayMsg();
	}

}
