package core.general;

public class MyClass implements MyInterfaceItf {

	public static void main(String[] args) {
		System.out.println(a);
		MyClass mc = new MyClass();
		mc.method1();
        //a = 20;
	}

	@Override
	public void method1() {
		System.out.println("Method1 calling");
		
	}

}
