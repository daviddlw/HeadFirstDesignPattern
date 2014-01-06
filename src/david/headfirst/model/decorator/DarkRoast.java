package david.headfirst.model.decorator;

public class DarkRoast extends Beverage {
	
	public DarkRoast() {
		description = "Å¨Ëõ¿§·È(Espresso)";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.99;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}
}
