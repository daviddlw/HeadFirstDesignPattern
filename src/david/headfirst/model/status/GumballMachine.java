package david.headfirst.model.status;

public class GumballMachine {
	private IState soldOutState;
	private IState noQuarterState;
	private IState hasQuarterState;
	private IState soldState;
	private IState winnerState;
	private IState state = soldOutState;
	private int count;

	public GumballMachine(int count) {
		// TODO Auto-generated constructor stub
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		this.count = count;
		if (count > 0)
			state = noQuarterState;
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	/*
	 * �û�������ֱ��Ҫ�󷢷��ǹ���һ����ͨ���ֱ�ת������
	 */
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	public void refill(int count) {
		state.refill(count);
	}

	public void setState(IState state) {
		this.state = state;
	}

	public IState getNoQuarterState() {
		return noQuarterState;
	}

	public IState getSoldOutState() {
		return soldOutState;
	}

	public IState getSoldState() {
		return soldState;
	}

	public IState getHasQuarterState() {
		return hasQuarterState;
	}

	public IState getWinnerState() {
		return winnerState;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void releaseGumball() {
		releaseGumball(1);
	}

	public void releaseGumball(int num) {
		System.out.println("����ȡ����" + num + "���ǹ��������...");
		if (count > 0)
			count = count - num;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�ǹ�����ʣ��" + count + "���ǹ�...";
	}
}
