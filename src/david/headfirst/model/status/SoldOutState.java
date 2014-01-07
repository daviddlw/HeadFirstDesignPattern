package david.headfirst.model.status;

public class SoldOutState implements IState {
	private GumballMachine machine;

	public SoldOutState(GumballMachine machine) {
		// TODO Auto-generated constructor stub
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("您不需要投入硬币，糖果已经售完...");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("你不能退币，因为您还没有投入过硬币...");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("对不起，糖果已经售完...");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("对不起，糖果已经售完...");
	}

	@Override
	public void refill(int count) {
		// TODO Auto-generated method stub
		System.out.println("重新填充了" + count + "颗糖果");
		machine.setState(machine.getNoQuarterState());
		machine.setCount(count);
	}
}
