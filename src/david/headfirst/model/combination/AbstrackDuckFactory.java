package david.headfirst.model.combination;

public abstract class AbstrackDuckFactory {	
	public abstract IDuck createMallardDuck();
	
	public abstract IDuck createRedHeadDuck();
	
	public abstract IDuck createDuckCall();
	
	public abstract IDuck createRubberDuck();
}

class DuckFactory extends AbstrackDuckFactory{

	@Override
	public IDuck createMallardDuck() {
		// TODO Auto-generated method stub
		return new MallardDuck();
	}

	@Override
	public IDuck createRedHeadDuck() {
		// TODO Auto-generated method stub
		return new RedHeadDuck();
	}

	@Override
	public IDuck createDuckCall() {
		// TODO Auto-generated method stub
		return new DuckCall();
	}

	@Override
	public IDuck createRubberDuck() {
		// TODO Auto-generated method stub
		return new RubberDuck();
	}
	
}

class CountingDuckFactory extends AbstrackDuckFactory{

	@Override
	public IDuck createMallardDuck() {
		// TODO Auto-generated method stub
		return new DuckCounter(new MallardDuck());
	}

	@Override
	public IDuck createRedHeadDuck() {
		// TODO Auto-generated method stub
		return new DuckCounter(new RedHeadDuck());
	}

	@Override
	public IDuck createDuckCall() {
		// TODO Auto-generated method stub
		return new DuckCounter(new DuckCall());
	}

	@Override
	public IDuck createRubberDuck() {
		// TODO Auto-generated method stub
		return new DuckCounter(new RubberDuck());
	}
	
}
