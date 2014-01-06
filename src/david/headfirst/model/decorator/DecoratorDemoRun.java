package david.headfirst.model.decorator;

public class DecoratorDemoRun {

	public static void decoratorDemoRun() {
		Beverage beverage = new Whip(new Soy(new Mocha(new HouseBlend())));
		showBeverageInfos(beverage);

		Beverage beverage2 = new SmallCup(new Whip(new Soy(new Mocha(new HouseBlend()))));
		showBeverageInfos(beverage2);
	}

	private static void showBeverageInfos(Beverage beverage) {
		System.out.println(beverage.getDescription());
		System.out.println(String.format("%.2f", beverage.cost()));		
	}
}
