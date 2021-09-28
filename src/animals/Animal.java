package animals;

//Parent class waar de childclasses gaan inheriten
public abstract class Animal {
	 protected String name;
	 protected int age;

	 public Animal(String name, int age) {
	  this.name = name;
	  this.age = age;
	 }

	 public String getName() {
	  return name;
	 }

	 public void setName(String name) {
	  this.name = name;
	 }

	 public int getAge() {
	  return age;
	 }

	 public void setAge(int age) {
	  this.age = age;
	 }
	 public abstract void speak();
	 
	 public abstract void friendly();
	}
