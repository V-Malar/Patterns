package templatepattern;

/*
 * Template method design pattern is to define an algorithm as a skeleton of
 *  operations and leave the details to be implemented by the child classes. 
 *  The overall structure and sequence of the algorithm are preserved by the 
 *  parent class. Template means Preset format like HTML templates which has 
 *  a fixed preset format. Similarly in the template method pattern, we have 
 *  a preset structure method called template method which consists of steps. 
 *  These steps can be an abstract method that will be implemented by its 
 *  subclasses. This behavioral design pattern is one of the easiest to 
 *  understand and implement. This design pattern is used popularly in 
 *  framework development. This helps to avoid code duplication also.
 */
abstract class Players {
	abstract public void name();

	abstract public void age();

	abstract public void sportName();

	abstract public void country();

	final void player_details() {
		name();
		age();
		sportName();
		country();
	}
}

class Soccer extends Players {
	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Lionel Messi");
	}

	@Override
	public void age() {
		// TODO Auto-generated method stub
		System.out.println("34");
	}

	@Override
	public void sportName() {
		// TODO Auto-generated method stub
		System.out.println("Soccer");
	}

	@Override
	public void country() {
		// TODO Auto-generated method stub
		System.out.println("Argentina");
	}
}

class Cricket extends Players {

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Virat Kohli");
	}

	@Override
	public void age() {
		// TODO Auto-generated method stub
		System.out.println("35");
	}

	@Override
	public void sportName() {
		// TODO Auto-generated method stub
		System.out.println("Cricket");
	}

	@Override
	public void country() {
		// TODO Auto-generated method stub
		System.out.println("India");
	}
}

class Hockey extends Players {

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Sidney Crosby");
	}

	@Override
	public void age() {
		// TODO Auto-generated method stub
		System.out.println("36");
	}

	@Override
	public void sportName() {
		// TODO Auto-generated method stub
		System.out.println("Hockey");
	}

	@Override
	public void country() {
		// TODO Auto-generated method stub
		System.out.println("Canada");
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Players soccer = new Soccer();
		soccer.player_details();
		System.out.println();
		Players cricket = new Cricket();
		cricket.player_details();
		System.out.println();
		Players hockey = new Hockey();
		hockey.player_details();
	}

}
