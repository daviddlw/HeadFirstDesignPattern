package david.headfirst.model.strategy;

public abstract class Duck {
	protected IFlyBehavior flyBehavior;
	protected IQuackBehavior quackBehavior;
	
	public Duck() {
		// TODO Auto-generated constructor stub
	}	
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
}

class MallardDuck extends Duck{
	
	public MallardDuck() {
		// TODO Auto-generated constructor stub
		flyBehavior = new MallardDuckFly();
		quackBehavior = new MallardDuckQuack();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a mallard duck");
	}	
}

class YellowDuck extends Duck{
	
	public YellowDuck() {
		// TODO Auto-generated constructor stub
		flyBehavior = new YellowDuckFly();
		quackBehavior = new YellowDuckQuack();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a yellow duck");
	}
}
