package david.headfirst.model.observer;

public class CurrentConditionDisplay extends Observer implements IDisplay {	
	
	public CurrentConditionDisplay(ISubject subject) {
		// TODO Auto-generated constructor stub
		this.subject = subject;
		subject.registerObservers(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		String information = String.format("Current conditions: %d F degrees and %d humidity", temperature, humidity);
		System.out.println(information);
	}

	@Override
	public void update(int temperature, int humidity, int pressure) {
		// TODO Auto-generated method stub
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
}
