package david.headfirst.demo;

import david.headfirst.model.factory.ChicagoPizzaStore;
import david.headfirst.model.factory.NyPizzaStore;
import david.headfirst.model.factory.PizzaStore;
import david.headfirst.model.factory.PizzaTypeEnum;

public class FactoryDemoRun {

	public static void pizzaFactoryDemo() {
		PizzaStore nyPizzaStore = new NyPizzaStore();
		nyPizzaStore.orderPizza(PizzaTypeEnum.ги©ка╕);
		System.out.println("-----------------------------");
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		chicagoPizzaStore.orderPizza(PizzaTypeEnum.ж╔й©);
	}
}
