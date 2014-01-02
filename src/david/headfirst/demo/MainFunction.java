package david.headfirst.demo;

import david.headfirst.model.adapter.AdapterDemoRun;
import david.headfirst.model.command.CommandDemoRun;
import david.headfirst.model.proxy.DynamicProxyDemoRun;
import david.headfirst.model.proxy.PersonBeanImp;

public class MainFunction {

	public static void main(String[] args) {
		// FactoryDemoRun.pizzaFactoryDemo();
		// CommandDemoRun.commandDemoRun();
		// CommandDemoRun.kitchenOrRoomDemoRun();
		// CommandDemoRun.commandFullyDemoRun();
		// CommandDemoRun.ceilFanCommandWithDetailUndoInfo();
		// CommandDemoRun.marcoCommandDemoRun();
		// AdapterDemoRun.testAdapterDemoRun();
		// ProxyDemoRun.testProxyDemoRun();
		// DynamicProxyDemoRun.getOwnerProxy();
		// DynamicProxyDemoRun.getNotOwnerProxy();
		DynamicProxyDemoRun.getProxy(false);
	}
}
