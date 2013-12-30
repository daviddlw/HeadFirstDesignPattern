package david.headfirst.model.command;

public class AirCondition {
	private String name;

	public AirCondition(String name) {
		this.name = name;
	}

	public void setTemperature(int num) {
		System.out.println("空调调温至" + num + "摄氏度。");
	}

	public void on() {
		System.out.println(name + "空调开");
	}

	public void off() {
		System.out.println(name + "空调关");
	}
}
