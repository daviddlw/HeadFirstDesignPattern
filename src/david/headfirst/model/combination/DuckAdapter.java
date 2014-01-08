package david.headfirst.model.combination;

public class DuckAdapter implements IDuck {
	private Goose goose;
	
	public DuckAdapter(Goose goose) {
		// TODO Auto-generated constructor stub
		this.goose = goose;
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		goose.honk();
	}
}
