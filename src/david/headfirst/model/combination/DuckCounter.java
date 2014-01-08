package david.headfirst.model.combination;

public class DuckCounter implements IDuck {
	private static int count = 0;
	IDuck duck;

	public DuckCounter(IDuck duck) {
		// TODO Auto-generated constructor stub
		this.duck = duck;
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		duck.quack();
		count++;
	}

	public static int getCount(){
		return count;
	}
}
