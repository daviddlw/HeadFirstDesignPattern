package david.headfirst.model.factory;


public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(PizzaTypeEnum type) {
		System.out.println("Chicago Pizza Store");
		// System.out.println("Ԥ����" + type.toString() + "��ζ");
		Pizza pizza = null;
		switch (type) {
		case ֥ʿ:
			pizza = new ChicagoCheesePizza();
			break;
		case �ɿ���:
			pizza = new ChicagoCholocatePizza();
			break;
		case ����:
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
		name = "֥�Ӹ��ζ֥ʿ����";
	}
	
	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("�����з֣�֥�Ӹ��ζ֥ʿ");
	}
}

class ChicagoCholocatePizza extends Pizza {
	public ChicagoCholocatePizza() {
		name = "֥�Ӹ��ζ�ɿ�������";
	}
}

class ChicagoCreamPizza extends Pizza {
	public ChicagoCreamPizza() {
		name = "֥�Ӹ��ζ��������";
	}
}
