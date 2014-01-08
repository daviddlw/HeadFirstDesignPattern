package david.headfirst.model.combination;

import java.util.ArrayList;
import java.util.List;

public class DuckSimulator {

	private List<IDuck> ducks = new ArrayList<IDuck>();

	public void addDucks(IDuck duck) {
		ducks.add(duck);
	}

	public void simlateWithDucks() {		
		for (IDuck duck : ducks) {
			simulate(duck);
		}
	}

	private void simulate(IDuck duck) {
		duck.quack();
	}

	public void getQuackCount() {
		System.out.println("一共鸣叫了" + DuckCounter.getCount() + "次");
	}
}
