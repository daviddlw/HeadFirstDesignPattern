package david.headfirst.model.command;

public class AirCondition {
	private String name;

	public AirCondition(String name) {
		this.name = name;
	}

	public void setTemperature(int num) {
		System.out.println("�յ�������" + num + "���϶ȡ�");
	}

	public void on() {
		System.out.println(name + "�յ���");
	}

	public void off() {
		System.out.println(name + "�յ���");
	}
}
