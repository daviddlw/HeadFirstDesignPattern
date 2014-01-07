package david.headfirst.model.status;

public class SoldState implements IState {
	private GumballMachine machine;

	public SoldState(GumballMachine machine) {
		// TODO Auto-generated constructor stub
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("请稍后，我们已经在准备糖果了...请稍后投币...");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("对不起，您已经转动过手柄了...");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("对不起，您不能转动2次手柄...");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		machine.releaseGumball();
		if (machine.getCount() > 0)
			machine.setState(machine.getNoQuarterState());
		else {
			System.out.println("对不起，糖果已经售完...");
			machine.setState(machine.getSoldOutState());
		}
	}

	@Override
	public void refill(int count) {
		// TODO Auto-generated method stub
		System.out.println("糖果机里已经有糖果了，不需要重复填充...");
	}
}
