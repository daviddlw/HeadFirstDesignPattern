package david.headfirst.model.template;

public abstract class CaffeineBeverage {

	public void prepareRecipe() {
		boilingWater();
		brew();
		pourInCup();
		if (containsCondiment())
			addCondiment();
	}

	public void boilingWater() {
		System.out.println("׼����ˮ...");
	}

	public abstract void brew();

	public void pourInCup() {
		System.out.println("��ˮ���뱭��...");
	}

	public abstract void addCondiment();

	public boolean containsCondiment() {
		return true;
	}

}

class TeaBeverage extends CaffeineBeverage {

	@Override
	public void brew() {
		// TODO Auto-generated method stub
		System.out.println("��ˮ���ݲ�Ҷ..");
	}

	@Override
	public void addCondiment() {
		// TODO Auto-generated method stub
		System.out.println("��Ӳ�Ҷר�ò�Ҷ��...");
	}

}

class CoffeeBeverage extends CaffeineBeverage {

	@Override
	public void brew() {
		// TODO Auto-generated method stub
		System.out.println("��ˮ���ݿ���...");
	}

	@Override
	public void addCondiment() {
		// TODO Auto-generated method stub
		System.out.println("��ӿ���ר�õ�ζ��...");
	}
	
	/*
	 * (non-Javadoc)
	 * @see david.headfirst.model.template.CaffeineBeverage#containsCondiment()
	 * ���ӷ���ͨ��������д���ӣ��ı丸���е���Ϊ
	 */
	@Override
	public boolean containsCondiment() {
		// TODO Auto-generated method stub
		return false;
	}
}
