package core.upcasttest;

public class Dog  extends Animal{
public void eating(){
	System.out.println("Dog is eating");
}
public Dog(){
	System.out.println("Dog Cons function calling");
}

public void dogMethod(){
	System.out.println("Dog Method unique");
}
}
