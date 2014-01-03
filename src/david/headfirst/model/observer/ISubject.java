package david.headfirst.model.observer;

public interface ISubject {
	
	public void registerObservers(Observer observer);
	
	public void removeObservers(Observer observer);
	
	public void notifyObservers();
}
