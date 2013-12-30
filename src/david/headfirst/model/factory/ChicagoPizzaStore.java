package david.headfirst.model.factory;


public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(PizzaTypeEnum type) {
		System.out.println("Chicago Pizza Store");
		// System.out.println("预定了" + type.toString() + "风味");
		Pizza pizza = null;
		switch (type) {
		case 芝士:
			pizza = new ChicagoCheesePizza();
			break;
		case 巧克力:
			pizza = new ChicagoCholocatePizza();
			break;
		case 奶油:
			pizza = new ChicagoCreamPizza();
			break;
		default:
			break;
		}
		return pizza;
	}
}

class ChicagoCheesePizza extends Pizza {
	public ChicagoCheesePizza() {
		name = "芝加哥风味芝士披萨";
	}
	
	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("重新切分！芝加哥风味芝士");
	}
}

class ChicagoCholocatePizza extends Pizza {
	public ChicagoCholocatePizza() {
		name = "芝加哥风味巧克力披萨";
	}
}

class ChicagoCreamPizza extends Pizza {
	public ChicagoCreamPizza() {
		name = "芝加哥风味奶油披萨";
	}
}
