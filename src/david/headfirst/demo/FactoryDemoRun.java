package david.headfirst.demo;

import david.headfirst.model.ChicagoPizzaStore;
import david.headfirst.model.NyPizzaStore;
import david.headfirst.model.PizzaStore;
import david.headfirst.model.PizzaTypeEnum;

public class FactoryDemoRun {

	public static void pizzaFactoryDemo() {
		PizzaStore nyPizzaStore = new NyPizzaStore();
		nyPizzaStore.orderPizza(PizzaTypeEnum.ги©ка╕);
		System.out.println("-----------------------------");
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		chicagoPizzaStore.orderPizza(PizzaTypeEnum.ж╔й©);
	}
}
