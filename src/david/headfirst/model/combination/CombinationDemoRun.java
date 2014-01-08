package david.headfirst.model.combination;

public class CombinationDemoRun {
	public static void testDuckSimulatorDemo() {
		DuckSimulator duckSimulator = new DuckSimulator();
		AbstrackDuckFactory duckFactory = new CountingDuckFactory();
		duckSimulator.addDucks(duckFactory.createMallardDuck());
		duckSimulator.addDucks(duckFactory.createRedHeadDuck());
		duckSimulator.addDucks(duckFactory.createDuckCall());
		duckSimulator.addDucks(duckFactory.createRubberDuck());
		duckSimulator.addDucks(new DuckAdapter(new Goose()));
		duckSimulator.simlateWithDucks();
		duckSimulator.getQuackCount();
	}
}
