package david.headfirst.model.command;

public class KitchenLight {
	
	public void openOilFacility() {
		System.out.println("开启吸油烟机");
	}
	
	public void closeOilFacility() {
		System.out.println("关闭吸油烟机");
	}

	public void on() {
		System.out.println("打开厨房灯");
	}
	
	public void off() {
		System.out.println("关闭厨房灯");
	}
}
