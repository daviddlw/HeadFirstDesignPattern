package david.headfirst.model.combination;

public interface IDuck {
	public void quack();
}

class MallardDuck implements IDuck{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Quack");
	}

}

class RedHeadDuck implements IDuck{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Quack");
	}
	
}

class DuckCall implements IDuck{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Kwak");
	}
	
}

class RubberDuck implements IDuck{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Squeak");
	}
	
}
