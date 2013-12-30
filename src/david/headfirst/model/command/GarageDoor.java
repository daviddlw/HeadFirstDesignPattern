package david.headfirst.model.command;

public class GarageDoor {
	
	public GarageDoor() {
 
	}
	
	public void up() {
		System.out.println("车库门开启");
	}
	
	public void down() {
		System.out.println("车库门下降");
	}
	
	public void close() {
		System.out.println("车库门关闭");
	}
	
	public void lightOn() {
		System.out.println("车库灯开启");
	}
	
	public void lightOff() {
		System.out.println("车库灯关闭");	
	}
}
