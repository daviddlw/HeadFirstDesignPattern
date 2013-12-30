package david.headfirst.model;

public class NyPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(PizzaTypeEnum type) {
		System.out.println("NewYork Pizza Store");
//		System.out.println("Ԥ����" + type.toString() + "��ζ");
		Pizza pizza = null;
		switch (type) {
		case ֥ʿ:
			pizza = new NyCheesePizza();

			break;
		case �ɿ���:
			pizza = new NyCholocatePizza();
			break;
		case ����:
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
		name = "ŦԼ��ζ֥ʿ����";
	}
}

class NyCholocatePizza extends Pizza {
	public NyCholocatePizza() {
		// TODO Auto-generated constructor stub
		name = "ŦԼ��ζ�ɿ�������";
	}
	
	@Override
	public void box() {
		// TODO Auto-generated method stub
		System.out.println("���´��ŦԼ��ζ����");
	}
}

class NyCreamPizza extends Pizza {
	public NyCreamPizza() {
		// TODO Auto-generated constructor stub
		name = "ŦԼ��ζ��������";
	}
}
