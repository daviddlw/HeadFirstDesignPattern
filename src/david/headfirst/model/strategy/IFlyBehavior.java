package david.headfirst.model.strategy;

public interface IFlyBehavior {
	public void fly();
}

class MallardDuckFly implements IFlyBehavior{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Mallard duck can fly a long way.");
	}
}

class YellowDuckFly implements IFlyBehavior{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Yellow duck cannot fly");
	}
}