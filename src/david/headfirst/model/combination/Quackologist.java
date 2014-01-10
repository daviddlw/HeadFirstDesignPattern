package david.headfirst.model.combination;

public class Quackologist implements ICustomObserver {

	@Override
	public void update(IDuckObservable observableDuck) {
		// TODO Auto-generated method stub
		System.out.println("Quackologist: " + observableDuck + " just quacked.");
	}
}
