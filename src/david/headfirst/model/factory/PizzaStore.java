package david.headfirst.model.factory;


public abstract class PizzaStore {

	private Pizza pizza;

	public PizzaStore() {
		// TODO Auto-generated constructor stub
		pizza = new Pizza();
	}

	public void orderPizza(PizzaTypeEnum type) {
		pizza = createPizza(type); //������Ϊ�Ѿ��ƽ��������У�ʵ�������������Ԥ����Ϊ�Ľ���
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}

	protected abstract Pizza createPizza(PizzaTypeEnum type);
}
