package david.headfirst.model.template;

public class TemplateDemoRun {
	
	/*
	 * ģ�巽��
	 */
	public static void templateDemoRun() {
		System.out.println("-------------����-------------");
		new CoffeeBeverage().prepareRecipe();
		System.out.println("-------------��---------------");
		new TeaBeverage().prepareRecipe();
	}
}
