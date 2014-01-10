package david.headfirst.model.combination;

import java.util.ArrayList;
import java.util.List;

public class Flock implements IDuck{
	
	private List<IDuck> ducks = new ArrayList<IDuck>();

	public void addDuck(IDuck duck) {
		ducks.add(duck);
	}

	public void simlateWithDucks() {		
		for (IDuck duck : ducks) {
			simulate(duck);
		}
	}
	
	private void simulate(IDuck duck) {
		duck.quack();
	}

	@Override
	public void registerObserver(ICustomObserver observer) {
		// TODO Auto-generated method stub
		for (IDuck duck : ducks) {
			duck.registerObserver(observer);
		}
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (IDuck duck : ducks) {
			duck.notifyObservers();
		}
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		for (IDuck duck : ducks) {
			duck.quack();
		}
	}
}
