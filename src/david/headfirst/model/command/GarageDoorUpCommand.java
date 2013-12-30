package david.headfirst.model.command;

public class GarageDoorUpCommand implements ICommand {
	GarageDoor door;

	public GarageDoorUpCommand(GarageDoor command) {
		this.door = command;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		door.up();
		door.lightOn();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("�����ſ�����������");
		door.lightOff();
		door.down();
		door.close();
	}
}

class GarageDoorDownCommand implements ICommand {
	GarageDoor door;

	public GarageDoorDownCommand(GarageDoor command) {
		// TODO Auto-generated constructor stub
		this.door = command;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		door.lightOff();
		door.down();
		door.close();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("�����Źرղ�������");
		door.up();
		door.lightOn();
	}
}
