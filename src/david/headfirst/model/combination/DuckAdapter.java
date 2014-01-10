package david.headfirst.model.combination;

public class DuckAdapter implements IDuck {
	private Goose goose;
	private IDuckObservable observable;

	public DuckAdapter(Goose goose) {
		// TODO Auto-generated constructor stub
		this.goose = goose;
		this.observable = new Observable(this);
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		goose.honk();
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
		return "DuckAdapter";
	}
}
