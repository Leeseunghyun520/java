package jump2java;
import java.util.Scanner;

class Animal {
	String name;
	int age;
	
	Animals(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
}
public class S05211 {
	public void static main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름:");
		String name =sc.next();
		System.out.print("나이:");
		int age = sc.nextInt();
		sc.close();
		
		Animal dog = new Animal(name, age);
		Animal cat = new Animal("연탄", 2);
		System.out.println(dog.name +" "+dog.age);
		System.out.println(cat.name +" "+cat.age);
		
		
	}
}
