package david.headfirst.model.observer;

public class ObserverDemoRun {

	public static void observerDemoRun() {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		weatherData.setMeasurements(1, 2, 3);
		weatherData.setMeasurements(4, 5, 6);
		System.out.println("after remoce forecast......");
		weatherData.removeObservers(forecastDisplay);
		weatherData.setMeasurements(1, 2, 3);
		weatherData.setMeasurements(4, 5, 6);
	}

	public static void observerDemoRunByObservable() {
		NewWeatherData newWeatherData = new NewWeatherData();
		NewForecastDisplay newForecastDisplay = new NewForecastDisplay(newWeatherData);
		newWeatherData.setMeasurements(1, 2, 3);
		newWeatherData.setMeasurements(4, 5, 6);
	}
}
