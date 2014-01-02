package david.headfirst.model.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IMyRemote extends Remote {

	public String sayHello() throws RemoteException;

	public CustomObj showCustomObj(int id, String name) throws RemoteException;
}
