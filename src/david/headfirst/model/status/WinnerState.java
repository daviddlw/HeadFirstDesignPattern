package david.headfirst.model.status;

import java.util.Random;

public class WinnerState implements IState {
	private GumballMachine machine;

	public WinnerState(GumballMachine machine) {
		// TODO Auto-generated constructor stub
		this.machine = machine;

	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("对不起，您已经投入了硬币，请稍后...");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("对不起，您已经转动了手柄，无法退币...");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("对不起，您已经转动了手柄，请稍后...");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("恭喜您，您是赢家，您可以幸运的获得2个糖果...");
		int restCount = machine.getCount();
		if (restCount == 0) {
			machine.setState(machine.getSoldOutState());
		} else {
			machine.releaseGumball(2);
			if (restCount > 0) {
				machine.setState(machine.getNoQuarterState());
			} else {
				machine.setState(machine.getSoldOutState());
			}
		}
	}

	@Override
	public void refill(int count) {
		// TODO Auto-generated method stub
		System.out.println("糖果机里已经有糖果了，不需要重复填充...");
	}

}
