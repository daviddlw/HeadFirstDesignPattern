package david.headfirst.model.observer;

import java.util.Observable;
import java.util.Observer;

public class NewWeatherData extends Observable {
	private int temperature;
	private int humidity;
	private int pressure;

	public NewWeatherData() {
		// TODO Auto-generated constructor stub
	}

	public void measurementChanged() {
		setChanged();
		notifyObservers();
	}

	public void setMeasurements(int temperature, int humidity, int pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}

	public int getTemperature() {
		return temperature;
	}

	public int getHumidity() {
		return humidity;
	}

	public int getPressure() {
		return pressure;
	}
}
