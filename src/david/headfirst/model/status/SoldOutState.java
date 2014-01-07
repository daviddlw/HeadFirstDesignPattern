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
		System.out.println("������ҪͶ��Ӳ�ң��ǹ��Ѿ�����...");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("�㲻���˱ң���Ϊ����û��Ͷ���Ӳ��...");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("�Բ����ǹ��Ѿ�����...");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("�Բ����ǹ��Ѿ�����...");
	}

	@Override
	public void refill(int count) {
		// TODO Auto-generated method stub
		System.out.println("���������" + count + "���ǹ�");
		machine.setState(machine.getNoQuarterState());
		machine.setCount(count);
	}
}
