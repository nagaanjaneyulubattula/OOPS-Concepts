package Polymorphism;

public class Animal {
	public void eat() {
		System.out.println("I like Meat");
	}
}
class dog extends Animal {
	public void eat() {
		System.out.println("I like meat & fish");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal A=new Animal();
		dog D=new dog();
		A.eat();
		D.eat();
		A=D;
		A.eat();
	}

}
