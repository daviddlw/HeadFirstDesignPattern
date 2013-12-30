package david.headfirst.model.command;

public class AirConditionOnCommand implements ICommand {
	AirCondition airCondtion;
	
	public AirConditionOnCommand(AirCondition airCondtion) {
		// TODO Auto-generated constructor stub
		this.airCondtion = airCondtion;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		airCondtion.on();
		airCondtion.setTemperature(27);
	}
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("�յ��ƿ�����������");
		airCondtion.off();
	}
}

class AirConditionOffCommand implements ICommand {
	AirCondition airCondtion;
	
	public AirConditionOffCommand(AirCondition airCondtion) {
		// TODO Auto-generated constructor stub
		this.airCondtion = airCondtion;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		airCondtion.setTemperature(0);
		airCondtion.off();
	}
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("�յ��ƹرղ�������");
		airCondtion.on();
	}
}
