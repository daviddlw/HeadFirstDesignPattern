package david.headfirst.model.proxy;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ProxyDemoRun {

	public static boolean isUsed = false;

	public static void testProxyDemoRun() {
		GumballMonitor monitor = new GumballMonitor(new GumballMachine("daviddai", 3));
		monitor.report();
	}

	/*
	 * 显示注册信息
	 */
	public static void showRegistryInformation(int port) {
		try {
			Registry registry = LocateRegistry.getRegistry(port);
			String[] registries = registry.list();
			for (String item : registries) {
				System.out.println(item);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void runServerRmi() {
		try {
			IMyRemote service = new MyRemoteImp();
			int port = 1000;
			Registry registry = null;
			if (!isUsed)
				registry = LocateRegistry.createRegistry(port);
			else
				registry = LocateRegistry.getRegistry(port);
			// showRegistryInformation(port);
			if (registry.list().length > 0) {
				registry.rebind("RemoteHelloWorld", service);
			} else {

				registry.bind("RemoteHelloWorld", service);
			}
			System.out.println("服务器端运行成功...");
			isUsed = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void runClientRmi() {
		try {
			Registry registry = LocateRegistry.getRegistry(1000);
			IMyRemote service = (IMyRemote) registry.lookup("RemoteHelloWorld");
			String s = service.sayHello();
			System.out.println(s);
			CustomObj obj = service.showCustomObj(1, "daviddai");
			System.out.println(obj);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
