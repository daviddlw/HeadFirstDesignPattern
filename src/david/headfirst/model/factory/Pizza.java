package david.headfirst.model.factory;

public class Pizza {

	String name;

	public void prepare() {
		System.out.println("1. pizza prepare " + name);
	}

	public void bake() {
		System.out.println("2. pizza bake " + name);
	}

	public void cut() {
		System.out.println("3. pizza cut " + name);
	}

	public void box() {
		System.out.println("4. pizza box " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
