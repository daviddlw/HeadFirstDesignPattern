package david.headfirst.model.strategy;

public interface IQuackBehavior {
	public void quack();
}

class MallardDuckQuack implements IQuackBehavior{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Mallard duck can quack for a large voice");
	}	
}

class YellowDuckQuack implements IQuackBehavior{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Yello duck quack with a little voice");
	}
}
