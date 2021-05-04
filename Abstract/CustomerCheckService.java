package Abstract;



import java.rmi.RemoteException;

import Entities.Customer;

public interface CustomerCheckService {
	
	boolean checkRealPerson(Customer customer) throws NumberFormatException, RemoteException;

}
