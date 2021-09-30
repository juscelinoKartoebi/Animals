package animals;

public class Main {
	public static void main(String[] args) {

		Dog myDog = new Dog("Spike", 2);
		Cat myCat = new Cat("Garfield", 3);
		Lion wildLion = new Lion("Simba", 10);

		// methods oproepen van je childclasses
		myDog.speak();
		myCat.speak();
		myDog.friendly();
		wildLion.speak();

	}
}