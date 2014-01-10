package david.headfirst.model.combination;

public interface IDuck extends IDuckObservable {
	public void quack();
}

class MallardDuck implements IDuck{
	private Observable observable;
	
	public MallardDuck() {
		// TODO Auto-generated constructor stub
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Quack");
	}

	@Override
	public void registerObserver(ICustomObserver observer) {
		// TODO Auto-generated method stub
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		observable.notifyObservers();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Mallard-Duck";
	}

}

class RedHeadDuck implements IDuck{
	private Observable observable;
	
	public RedHeadDuck() {
		// TODO Auto-generated constructor stub
		observable = new Observable(this);
	}
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Quack");
	}

	@Override
	public void registerObserver(ICustomObserver observer) {
		// TODO Auto-generated method stub
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		observable.notifyObservers();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Red-Head-Duck";
	}
	
}

class DuckCall implements IDuck{
	
	private Observable observable;
	
	public DuckCall() {
		// TODO Auto-generated constructor stub
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Kwak");
	}

	@Override
	public void registerObserver(ICustomObserver observer) {
		// TODO Auto-generated method stub
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		observable.notifyObservers();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Duck-Call";
	}
	
}

class RubberDuck implements IDuck{

	private Observable observable;
	
	public RubberDuck() {
		// TODO Auto-generated constructor stub
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Squeak");
	}

	@Override
	public void registerObserver(ICustomObserver observer) {
		// TODO Auto-generated method stub
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		observable.notifyObservers();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rubber-Duck";
	}
	
	
}
