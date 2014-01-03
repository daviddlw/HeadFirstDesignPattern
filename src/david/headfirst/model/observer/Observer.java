package david.headfirst.model.observer;

public abstract class Observer {
	
	protected int temperature;
	protected int humidity;
	protected int pressure;
	protected ISubject subject;
	
	public abstract void update(int temperature, int humidity, int pressure);	
}
