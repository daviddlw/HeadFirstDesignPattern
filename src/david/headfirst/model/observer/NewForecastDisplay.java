package david.headfirst.model.observer;

import java.util.Observable;
import java.util.Observer;

public class NewForecastDisplay implements Observer, IDisplay {
	Observable observable;
	private int temperature;
	private int pressure;
	
	public NewForecastDisplay(Observable observable) {
		// TODO Auto-generated constructor stub
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		String information = String.format("Forect conditions: %d F pressure and %d temperature", pressure, temperature);
		System.out.println(information);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(o instanceof NewWeatherData){
			NewWeatherData weatherData = (NewWeatherData)o;
			this.temperature = weatherData.getTemperature();
			this.pressure = weatherData.getPressure();
			display();
		}
	}

}
