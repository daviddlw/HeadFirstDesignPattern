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
		System.out.println("���Ѿ�Ͷ����һöӲ�ң������Ӳ�ڲ���Ӳ��...");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Ӳ�����ˣ������...");
		machine.setState(machine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("��ת�����ֱ�...");
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
		System.out.println("û���ǹ���������...");
	}

	@Override
	public void refill(int count) {
		// TODO Auto-generated method stub
		System.out.println("�ǹ������Ѿ����ǹ��ˣ�����Ҫ�ظ����...");
	}
}
