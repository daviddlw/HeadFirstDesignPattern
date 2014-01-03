package david.headfirst.model.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements ISubject {

	private int temperature;
	private int humidity;
	private int pressure;
	private List<Observer> observers = new ArrayList<Observer>();

	public WeatherData() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void registerObservers(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void removeObservers(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}

	public int getTemperture() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
	}

	public void setMeasurements(int temperature, int humidity, int pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}

	public void measurementChanged() {
		notifyObservers();
	}
}
