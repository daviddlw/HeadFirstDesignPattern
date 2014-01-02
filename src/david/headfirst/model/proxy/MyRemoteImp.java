package david.headfirst.model.proxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImp extends UnicastRemoteObject implements IMyRemote {

	protected MyRemoteImp() throws RemoteException {

	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String sayHello() throws RemoteException {
		// TODO Auto-generated method stub
		return "Server says hello world";
	}

	@Override
	public CustomObj showCustomObj(int id, String name) throws RemoteException {
		// TODO Auto-generated method stub
		return new CustomObj(id, name);
	}
}
