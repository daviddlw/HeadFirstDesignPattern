package david.headfirst.model;

public class NyPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(PizzaTypeEnum type) {
		System.out.println("NewYork Pizza Store");
//		System.out.println("预定了" + type.toString() + "风味");
		Pizza pizza = null;
		switch (type) {
		case 芝士:
			pizza = new NyCheesePizza();

			break;
		case 巧克力:
			pizza = new NyCholocatePizza();
			break;
		case 奶油:
			pizza = new NyCreamPizza();
			break;
		default:
			break;
		}
		return pizza;
	}
}

class NyCheesePizza extends Pizza {
	public NyCheesePizza() {
		// TODO Auto-generated constructor stub
		name = "纽约风味芝士披萨";
	}
}

class NyCholocatePizza extends Pizza {
	public NyCholocatePizza() {
		// TODO Auto-generated constructor stub
		name = "纽约风味巧克力披萨";
	}
	
	@Override
	public void box() {
		// TODO Auto-generated method stub
		System.out.println("重新打包纽约风味披萨");
	}
}

class NyCreamPizza extends Pizza {
	public NyCreamPizza() {
		// TODO Auto-generated constructor stub
		name = "纽约风味奶油披萨";
	}
}
