package david.headfirst.model.status;

import java.util.Random;

public class HasQuarterState implements IState {
	private GumballMachine machine;
	private Random random;

	public HasQuarterState(GumballMachine machine) {
		// TODO Auto-generated constructor stub
		this.machine = machine;
		random = new Random();
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("您已经投入了一枚硬币，请从退硬口查收硬币...");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("硬币已退，请查收...");
		machine.setState(machine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("你转动了手柄...");
		int randNum = random.nextInt(100);
		if (randNum <= -1 && machine.getCount() > 1) {
			machine.setState(machine.getWinnerState());
		} else {
			machine.setState(machine.getSoldState());
		}	
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("没有糖果可以售卖...");
	}

	@Override
	public void refill(int count) {
		// TODO Auto-generated method stub
		System.out.println("糖果机里已经有糖果了，不需要重复填充...");
	}
}
