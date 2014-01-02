package david.headfirst.model.adapter;


public class AdapterDemoRun {
	public static void testAdapterDemoRun() {
		IDuck duck = new MarllardDuck();
		duck.quack();
		duck.fly();
		ITurkey turkey = new WildTurkey();
		turkey.gobble();
		turkey.fly();
		System.out.println("-----------------");
		TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
		turkeyAdapter.quack();
		turkeyAdapter.fly();
		System.out.println("-----------------");
		DuckAdapter duckAdapter = new DuckAdapter(duck);
		duckAdapter.gobble();
		duckAdapter.fly();
	}
}
