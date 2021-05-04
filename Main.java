import java.rmi.RemoteException;
import java.util.Date;
import Abstract.CustomerService;
import Abstract.MernisAdapterService;
import Concrete.CustomerCheckManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	
	public static void main(String[] args) throws NumberFormatException, RemoteException {
		Customer ecem = new Customer();
		
	  ecem.setDateOfBirth(2002);
	  ecem.setFirstName("ECEM");
	  ecem.setId(1);
	  ecem.setLastName("GÜNENÇ");
	  ecem.setNationalityId("52159511166");
	  
	  
	  CustomerService customerCheckManager = new StarbucksCustomerManager(new MernisAdapterService());
	  
	  customerCheckManager.save(ecem);

	
		
		
	}
	
}


