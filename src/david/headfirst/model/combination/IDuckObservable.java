package david.headfirst.model.combination;

public interface IDuckObservable {	
	public void registerObserver(ICustomObserver observer);
	
	public void notifyObservers();
}
