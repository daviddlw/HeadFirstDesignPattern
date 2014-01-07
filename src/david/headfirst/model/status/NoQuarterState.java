package david.headfirst.model.status;

public class NoQuarterState implements IState {
	private GumballMachine machine;

	public NoQuarterState(GumballMachine machine) {
		// TODO Auto-generated constructor stub
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("您投入了一枚硬币...");
		machine.setState(machine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("对不起，您必须投入一枚硬币...");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("对不起，您还没有投入硬币...");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("对不起，您必须先付钱...");
	}

	@Override
	public void refill(int count) {
		// TODO Auto-generated method stub
		System.out.println("糖果机里已经有糖果了，不需要重复填充...");
	}
}
