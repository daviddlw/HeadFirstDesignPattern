package david.headfirst.model.command;

public class CeilFanOffCommand implements ICommand {
	private CeilingFan fan;
	private SpeedEnum speed;

	public CeilFanOffCommand(CeilingFan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		speed = fan.getSpeed();
		fan.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		logic.commonUndo(fan, speed);
	}
}

class CeilFanLowCommand implements ICommand{

	private CeilingFan fan;
	private SpeedEnum speed;

	public CeilFanLowCommand(CeilingFan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		speed = fan.getSpeed();
		fan.low();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		logic.commonUndo(fan, speed);
	}
}

class CeilFanMediumCommand implements ICommand{

	private CeilingFan fan;
	private SpeedEnum speed;

	public CeilFanMediumCommand(CeilingFan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		speed = fan.getSpeed();
		fan.medium();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		logic.commonUndo(fan, speed);
	}
}

class CeilFanHighCommand implements ICommand{

	private CeilingFan fan;
	private SpeedEnum speed;

	public CeilFanHighCommand(CeilingFan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		speed = fan.getSpeed();
		fan.high();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		logic.commonUndo(fan, speed);
	}
}
