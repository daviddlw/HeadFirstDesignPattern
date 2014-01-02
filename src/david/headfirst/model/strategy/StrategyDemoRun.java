package david.headfirst.model.strategy;

public class StrategyDemoRun {
	/*
	 * 策略模式鸭子示例
	 */
	public static void showDuckDemo() {
		Duck mDuck = new MallardDuck();
		mDuck.performFly();
		mDuck.performQuack();
		Duck yDuck = new YellowDuck();
		yDuck.performFly();
		yDuck.performQuack();
	}
}
