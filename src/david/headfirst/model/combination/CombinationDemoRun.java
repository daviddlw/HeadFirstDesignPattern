package david.headfirst.model.combination;

public class CombinationDemoRun {
	public static void testDuckSimulatorDemo() {
		DuckSimulator duckSimulator = new DuckSimulator();
		AbstrackDuckFactory duckFactory = new CountingDuckFactory();
		duckSimulator.simulate(duckFactory);
	}
}
