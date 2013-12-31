package david.headfirst.model.adapter;

public class TurkeyAdapter implements IDuck {
	private ITurkey trukey;
	
	public TurkeyAdapter(ITurkey trukey) {
		// TODO Auto-generated constructor stub
		this.trukey = trukey;
	}
	
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		trukey.gobble();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			trukey.fly();
		}
	}
}

class DuckAdapter implements ITurkey{
	IDuck duck;
	public DuckAdapter(IDuck duck) {
		// TODO Auto-generated constructor stub
		this.duck = duck;
	}
	@Override
	public void gobble() {
		// TODO Auto-generated method stub
		duck.quack();
		System.out.println("Do you think i'm a turkey?");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		duck.fly();
		System.out.println("I can fly like a trukey.");
	}
	
}
