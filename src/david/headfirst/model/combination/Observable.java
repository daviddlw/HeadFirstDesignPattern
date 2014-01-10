package david.headfirst.model.combination;

import java.util.ArrayList;
import java.util.List;

public class Observable implements IDuckObservable {
	private List<ICustomObserver> observers = new ArrayList<ICustomObserver>();
	IDuckObservable duckObserver;
	
	public Observable(IDuckObservable duckObserver) {
		// TODO Auto-generated constructor stub
		this.duckObserver = duckObserver;
	}
	
	@Override
	public void registerObserver(ICustomObserver observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (ICustomObserver observer : observers) {
			observer.update(duckObserver);
		}
	}

}
