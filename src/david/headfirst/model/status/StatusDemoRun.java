package david.headfirst.model.status;

public class StatusDemoRun {
	/*
	 * ״̬ģʽ���״̬��ת����
	 */
	public static void statusDemoRun() {
		GumballMachine machine = new GumballMachine(5);
		showMachineInfo(machine);

		 machine.insertQuarter();
		 machine.turnCrank();
		 showMachineInfo(machine);

		// machine.ejectQuarter();
		// showMachineInfo(machine);

		// machine.insertQuarter();
		// machine.insertQuarter();
		// machine.ejectQuarter();
		// machine.turnCrank();
		// showMachineInfo(machine);

		// machine.insertQuarter();
		// machine.turnCrank();
		// machine.insertQuarter();
		// machine.turnCrank();
		// machine.ejectQuarter();
		// machine.insertQuarter();
		// machine.ejectQuarter();
		// showMachineInfo(machine);

		// for (int i = 0; i < 5; i++) {
		// machine.insertQuarter();
		// machine.turnCrank();
		// }
		// showMachineInfo(machine);
	}

	private static void showMachineInfo(GumballMachine machine) {
		System.out.println(machine);
	}
}
