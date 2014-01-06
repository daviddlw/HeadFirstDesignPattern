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
		System.out.println("准备开水...");
	}

	public abstract void brew();

	public void pourInCup() {
		System.out.println("将水倒入杯子...");
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
		System.out.println("用水冲泡茶叶..");
	}

	@Override
	public void addCondiment() {
		// TODO Auto-generated method stub
		System.out.println("添加茶叶专用茶叶包...");
	}

}

class CoffeeBeverage extends CaffeineBeverage {

	@Override
	public void brew() {
		// TODO Auto-generated method stub
		System.out.println("用水冲泡咖啡...");
	}

	@Override
	public void addCondiment() {
		// TODO Auto-generated method stub
		System.out.println("添加咖啡专用调味料...");
	}
	
	/*
	 * (non-Javadoc)
	 * @see david.headfirst.model.template.CaffeineBeverage#containsCondiment()
	 * 钩子方法通过子类重写钩子，改变父类中的行为
	 */
	@Override
	public boolean containsCondiment() {
		// TODO Auto-generated method stub
		return false;
	}
}
