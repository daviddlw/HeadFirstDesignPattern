package david.headfirst.model.strategy;

public class StrategyDemoRun {
	/*
	 * ����ģʽѼ��ʾ��
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
