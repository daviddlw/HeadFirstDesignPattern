package david.headfirst.model.proxy;

import java.io.Serializable;

public class GumballMachine implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String location;
	private int count;

	public GumballMachine(String location, int count) {
		// TODO Auto-generated constructor stub
		this.location = location;
		this.count = count;
	}

	public String getLocation() {
		return location;
	}

	public int getCount() {
		return count;
	}
}
