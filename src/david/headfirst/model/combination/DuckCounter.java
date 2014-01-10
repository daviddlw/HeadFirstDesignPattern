package david.headfirst.model.combination;

public class DuckCounter implements IDuck {
	private static int count = 0;
	private IDuck duck;
	private IDuckObservable observable;

	public DuckCounter(IDuck duck) {
		// TODO Auto-generated constructor stub
		this.duck = duck;
		observable = new Observable(duck);
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		duck.quack();
		count++;
	}

	public static int getCount() {
		return count;
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
		return "DuckCounter";
	}
}
