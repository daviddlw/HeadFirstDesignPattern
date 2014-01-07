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
		System.out.println("��Ͷ����һöӲ��...");
		machine.setState(machine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("�Բ���������Ͷ��һöӲ��...");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("�Բ�������û��Ͷ��Ӳ��...");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("�Բ����������ȸ�Ǯ...");
	}

	@Override
	public void refill(int count) {
		// TODO Auto-generated method stub
		System.out.println("�ǹ������Ѿ����ǹ��ˣ�����Ҫ�ظ����...");
	}
}
