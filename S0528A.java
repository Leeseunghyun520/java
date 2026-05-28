package jump2java;

abstract class Animal {
	void sleep() {
		System.out.println("잠");
	}
	abstract void sound();
	
}

class Dog3 extends Animal {
	void sound() {
		System.out.println("멍멍");
	}
}
public class S0528A {

	public static void main(String[] args) {
		Dog3 dog = new Dog3();
        dog.sound();
        dog.sleep();
	}

}
