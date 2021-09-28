package animals;

public class Lion extends Animal {

	public Lion(String name, int age) {
		super(name, age);

	}
	public void speak() {
		System.out.println(this.name + " said rooaarrww!!! " + name + " said his age is " + age + " years old");
	}
	public void friendly() {
		System.out.println(this.name + " is very dangerous!");

	}

}
