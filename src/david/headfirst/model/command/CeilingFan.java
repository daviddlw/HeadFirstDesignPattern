package david.headfirst.model.command;

public class CeilingFan {
	private String location;
	private SpeedEnum speed;

	public CeilingFan(String location) {
		this.setLocation(location);
		this.speed = SpeedEnum.Off;
	}

	public void off() {
		speed = SpeedEnum.Off;
		System.out.println("Speed is " + speed.toString());
	}

	public void low() {
		speed = SpeedEnum.Low;
		System.out.println("Speed is " + speed.toString());
	}

	public void medium() {
		speed = SpeedEnum.Medium;
		System.out.println("Speed is " + speed.toString());
	}

	public void high() {
		speed = SpeedEnum.High;
		System.out.println("Speed is " + speed.toString());
	}

	public SpeedEnum getSpeed() {
		return speed;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}

enum SpeedEnum {
	Off, Low, Medium, High
}
