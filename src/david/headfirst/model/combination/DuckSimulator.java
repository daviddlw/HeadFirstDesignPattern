package david.headfirst.model.combination;

public class DuckSimulator {

	public void simulate(AbstrackDuckFactory duckFactory) {		
		IDuck redHeadDuck = duckFactory.createMallardDuck();
		IDuck duckCall = duckFactory.createDuckCall();
		IDuck rubberDuck = duckFactory.createRubberDuck();
		IDuck goose = new DuckAdapter(new Goose());

		System.out.println("Simulator: With Flocks");
		Flock flockOfDuck = new Flock();
		flockOfDuck.addDuck(redHeadDuck);
		flockOfDuck.addDuck(duckCall);
		flockOfDuck.addDuck(rubberDuck);
		flockOfDuck.addDuck(goose);

		Flock flockOfMallards = new Flock();
		IDuck mallard1 = duckFactory.createMallardDuck();
		IDuck mallard2 = duckFactory.createMallardDuck();
		IDuck mallard3 = duckFactory.createMallardDuck();
		IDuck mallard4 = duckFactory.createMallardDuck();

		flockOfMallards.addDuck(mallard1);
		flockOfMallards.addDuck(mallard2);
		flockOfMallards.addDuck(mallard3);
		flockOfMallards.addDuck(mallard4);
		
		System.out.println("--------------Whole Flock Simulation.--------------");
		flockOfDuck.simlateWithDucks();
		
		System.out.println("---------------Mallard Flock Simulation.----------------");
		flockOfMallards.simlateWithDucks();
		
		System.out.println("---------------Quackologist Part.----------------");
		Quackologist quackologist = new Quackologist();
		flockOfDuck.registerObserver(quackologist);
		flockOfDuck.notifyObservers();
		flockOfMallards.registerObserver(quackologist);
		flockOfMallards.notifyObservers();
		
		System.out.println("一共鸣叫了" + DuckCounter.getCount() + "次");
	}
}
