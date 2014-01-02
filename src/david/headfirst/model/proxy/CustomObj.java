package david.headfirst.model.proxy;

import java.io.Serializable;

public class CustomObj implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;

	public CustomObj(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("[Id: %d, Name: %s]", id, name);
	}
}
