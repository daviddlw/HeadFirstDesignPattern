package david.headfirst.model.command;

public class RoomLightOnCommand implements ICommand {
	private RoomLight light;
	
	public RoomLightOnCommand(RoomLight light) {
		this.light = light;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("����ƿ�����������");
		light.off();
	}
}

class RoomLightOffCommand implements ICommand{
	private RoomLight light;
	
	public RoomLightOffCommand(RoomLight light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("����ƹرղ�������");
		light.on();
	}
	
}
