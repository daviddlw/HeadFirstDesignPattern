package david.headfirst.model.proxy;

import java.io.Serializable;

public class GumballMonitor implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GumballMachine monitor;
	
	public GumballMonitor(GumballMachine monitor) {
		// TODO Auto-generated constructor stub
		this.monitor = monitor;
	}
	
	public void report() {
		System.out.println("Gumball Machine: "+monitor.getLocation());
		System.out.println("Current Inventory: "+monitor.getCount());	
	}
}
