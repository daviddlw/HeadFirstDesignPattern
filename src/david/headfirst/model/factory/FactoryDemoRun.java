package david.headfirst.model.factory;


public class FactoryDemoRun {

	public static void pizzaFactoryDemo() {
		PizzaStore nyPizzaStore = new NyPizzaStore();
		nyPizzaStore.orderPizza(PizzaTypeEnum.�ɿ���);
		System.out.println("-----------------------------");
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		chicagoPizzaStore.orderPizza(PizzaTypeEnum.֥ʿ);
	}
}
