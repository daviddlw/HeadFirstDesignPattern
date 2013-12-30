package david.headfirst.model.command;

public class KitchenLightOnCommand implements ICommand {

	public KitchenLight light;

	public KitchenLightOnCommand(KitchenLight light) {
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
		System.out.println("�����ƿ�����������");
		light.off();
	}
}

class KitchenLightOffCommand implements ICommand {

	public KitchenLight light;

	public KitchenLightOffCommand(KitchenLight light) {
		// TODO Auto-generated constructor stub
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
		System.out.println("�����ƹرղ�������");
		light.on();
	}
}
