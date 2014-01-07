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
		System.out.println("�Բ������Ѿ�Ͷ����Ӳ�ң����Ժ�...");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("�Բ������Ѿ�ת�����ֱ����޷��˱�...");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("�Բ������Ѿ�ת�����ֱ������Ժ�...");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("��ϲ��������Ӯ�ң����������˵Ļ��2���ǹ�...");
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
		System.out.println("�ǹ������Ѿ����ǹ��ˣ�����Ҫ�ظ����...");
	}

}
