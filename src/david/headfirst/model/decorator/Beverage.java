package david.headfirst.model.decorator;

/*
 * ���ϳ�����
 */
public abstract class Beverage {
	protected String description = "Unknown Beverage";

	public Beverage() {
		// TODO Auto-generated constructor stub
	}

	public abstract double cost();

	public String getDescription() {
		return description;
	}
}
