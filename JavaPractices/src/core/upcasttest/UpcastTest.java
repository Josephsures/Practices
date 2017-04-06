package core.upcasttest;

public class UpcastTest {

	public static void main(String[] args) {
		Animal a=new Animal();
		a.eating();
		Animal b= new Dog();
		b.eating();
		b.animalMethod();
		Dog c= (Dog) new Animal();
		c.dogMethod();
	}

}
