package adapterpattern;
/*
 * The Adapter pattern is a structural design pattern that allows objects with 
 * incompatible interfaces to work together. It acts as a bridge between two 
 * incompatible interfaces, converting the interface of one class into an interface 
 * that another class expects.
 */

// Make a Cat to Bark

interface DogSound {
	public void bark();
}
abstract class PetDog
{
	PetDog()
	{
		System.out.println("Dog");
	}
}
abstract class PetCat
{
	PetCat()
	{
		System.out.println("Cat");
	}
}
class Dog implements DogSound {
	Dog()
	{
		System.out.println("Dog");
	}
	public void bark() {
		System.out.println("Barks...");
	}
}

interface CatSound {
	public void meaw();
}

class Cat implements CatSound {
	Cat()
	{
		System.out.println("Cat");
	}
	public void meaw() {
		System.out.println("Meaws...");
	}
}
class Adapter implements CatSound
{
	Dog dog;
	public Adapter()
	{
		
	}
	public Adapter(Dog dog)
	{
		System.out.println("Cat");
		this.dog = dog;
	}
	public void meaw()
	{
		dog.bark();
	}
}
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		
		d.bark();
		CatSound c = new Cat();
		c.meaw();
		System.out.println("To make the Cat BARK...");
		CatSound catmeaw = new Adapter(d);
		catmeaw.meaw();
	}

}
