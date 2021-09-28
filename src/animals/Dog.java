package animals;

//childclass
public class Dog extends Animal {

	public Dog(String name, int age) {
		super(name, age);
	}
	public void speak() {
		System.out.println(this.name + " said woof woof!");
	}
	public void friendly() {
		System.out.println(this.name + " is very friendly!");
	}

}
