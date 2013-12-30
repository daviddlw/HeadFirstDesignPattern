package david.headfirst.model.command;

public class CommonLogic {
	/*
	 * 公共操作类
	 */
	public void commonUndo(CeilingFan fan, SpeedEnum speed) {
		switch (speed) {
		case Off:
			fan.off();
			break;
		case Low:
			fan.low();
			break;
		case Medium:
			fan.medium();
			break;
		case High:
			fan.high();
			break;
		default:
			break;
		}
	}
}
