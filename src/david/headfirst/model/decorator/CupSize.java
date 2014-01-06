package david.headfirst.model.decorator;

public abstract class CupSize extends Beverage {
	public abstract String getDescription();
}

class BigCup extends CupSize {
	private Beverage beverage;

	public BigCup(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.1 + beverage.cost();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", ´ó±­¿§·È";
	}
}

class MediumCup extends CupSize {
	private Beverage beverage;

	public MediumCup(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.15 + beverage.cost();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", ÖÐ±­¿§·È";
	}
}

class SmallCup extends CupSize {
	private Beverage beverage;

	public SmallCup(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.2 + beverage.cost();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Ð¡±­¿§·È";
	}
}
