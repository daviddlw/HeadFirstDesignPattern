package david.headfirst.model.factory;


public abstract class PizzaStore {

	private Pizza pizza;

	public PizzaStore() {
		// TODO Auto-generated constructor stub
		pizza = new Pizza();
	}

	public void orderPizza(PizzaTypeEnum type) {
		pizza = createPizza(type); //创建行为已经移交到子类中，实现了与基类披萨预定行为的解耦
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}

	protected abstract Pizza createPizza(PizzaTypeEnum type);
}
