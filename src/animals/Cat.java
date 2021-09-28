package animals;

public class Cat extends Animal {

	public Cat(String name, int age) {
		super(name, age);
	}
	public void speak() {
		System.out.println(this.name + " said meowww!");
	}
	public void friendly() {
		System.out.println(this.name + " is friendly!");
		
	}
}