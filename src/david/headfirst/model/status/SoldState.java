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
		System.out.println("���Ժ������Ѿ���׼���ǹ���...���Ժ�Ͷ��...");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("�Բ������Ѿ�ת�����ֱ���...");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("�Բ���������ת��2���ֱ�...");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		machine.releaseGumball();
		if (machine.getCount() > 0)
			machine.setState(machine.getNoQuarterState());
		else {
			System.out.println("�Բ����ǹ��Ѿ�����...");
			machine.setState(machine.getSoldOutState());
		}
	}

	@Override
	public void refill(int count) {
		// TODO Auto-generated method stub
		System.out.println("�ǹ������Ѿ����ǹ��ˣ�����Ҫ�ظ����...");
	}
}
