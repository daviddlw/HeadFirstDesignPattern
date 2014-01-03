package david.headfirst.model.observer;

public class ForecastDisplay extends Observer implements IDisplay {
	
	public ForecastDisplay(ISubject subject) {
		// TODO Auto-generated constructor stub
		this.subject = subject;
		subject.registerObservers(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		String information = String.format("Forect conditions: %d F pressure and %d temperature", pressure, temperature);
		System.out.println(information);
	}

	@Override
	public void update(int temperature, int humidity, int pressure) {
		// TODO Auto-generated method stub
		this.pressure = pressure;
		this.temperature = temperature;
		display();
	}

}
