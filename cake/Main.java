package cake;

/*
 * AbstractClass contains the templateMethod() which should be made final 
 * so that it cannot be overridden. This template method makes use of 
 * other operations available in order to run the algorithm but is 
 * decoupled for the actual implementation of these methods. All operations 
 * used by this template method are made abstract, so their implementation 
 * is deferred to subclasses. ConcreteClass implements all the operations 
 * required by the templateMethod that were defined as abstract in the 
 * parent class. There can be many different ConcreteClasses.
 */

/*
 * The Decorator pattern is a structural design pattern that allows behavior to 
 * be added to individual objects dynamically without affecting the behavior of 
 * other objects from the same class. It is used to extend the functionality of 
 * objects at runtime by wrapping them in decorator objects.
 */
abstract class Cake {
	final public void flour() {
		System.out.println("Take cake flour..");
	}

	final public void addIngredients() {
		System.out.println("Select your ingredients needed..");
	}

	final public void onPan() {
		System.out.println("CAKE PREPARATION\n");
		System.out.println("Take Pan..");
	}

	final public void oven() {
		System.out.println("Oven preheated..");
	}

	final public void batter() {
		System.out.println("Add batter to the pan..");
	}

	final public void offPan() {
		System.out.println("Take cake from Pan..\n");
	}
}

abstract class WengersDeli extends Cake {

	final public void makeCake() {
		onPan();
		oven();
		flour();
		addIngredients();
		batter();
		offPan();
	}

	public abstract int cost();
}

abstract class Cream extends WengersDeli {

}

abstract class Toppings extends WengersDeli {

}

class Strawberry extends Cream {
	WengersDeli w;
//	int custom_value;

	public Strawberry() {

	}

	public Strawberry(WengersDeli w) {
		this.w = w;
//		this.custom_value = custom_value;
	}

//	public Strawberry(WengersDeli w,int custom_value) {
//		this.w = w;
//		this.custom_value = custom_value;
//	}

	@Override
	public int cost() {
		if (w != null) {
			System.out.println("-------Strawberry Cream added..");
			return 10 + w.cost();
// custom_value +
		} else {
			return 10;
		}
	}
}

class Banana extends Cream {
	WengersDeli w;

	public Banana() {

	}

	public Banana(WengersDeli w) {
		this.w = w;
	}

	@Override
	public int cost() {
		if (w != null) {
			System.out.println("-------Banana Cream added..");
			return 10 + w.cost();
		} else {
			return 10;
		}
	}
}

class Cherries extends Toppings {
	WengersDeli w;

	Cherries() {

	}

	Cherries(WengersDeli w) {
		this.w = w;
	}

	@Override
	public int cost() {
		if (w != null) {
			System.out.println("*******Cheery at top added..");
			return 5 + w.cost();
		} else {
			return 5;
		}
	}
}

class NoCream extends Cream {
	public int cost() {
		return 0;
	}
}

class RoyalIcing extends Toppings {
	WengersDeli w;

	RoyalIcing() {

	}

	RoyalIcing(WengersDeli w) {
		this.w = w;
	}

	public int cost() {
		if (w != null) {
			System.out.println("-------RoyalIcing Topping added..");
			return 200 + w.cost();
		} else {
			return 200;
		}
	}
}

class MirrorGlaze extends Toppings {
	WengersDeli w;

	MirrorGlaze() {

	}

	MirrorGlaze(WengersDeli w) {
		this.w = w;
	}

	@Override
	public int cost() {
		if (w != null) {
			System.out.println("-------MirrorGlaze Topping added..");
			return 300 + w.cost();
		} else {
			return 300;
		}
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WengersDeli w = new NoCream();
//		Strawberry s1 = new Strawberry(w, 200);
//		Strawberry s2 = new Strawberry(w, 500);
////		Strawberry s = new Strawberry(w, 200);
//		System.out.println(s1.cost()+ s2.cost());
		WengersDeli w = new Strawberry(
				new MirrorGlaze(new RoyalIcing(new Banana(new MirrorGlaze(new Cherries(new NoCream()))))));
		w.makeCake();
		System.out.println("\nYour cake cost: $ " + w.cost());
	}

}
