package Concrete;
import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	CustomerCheckService customerCheckService;
	
	
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}



	@Override
	public void save(Customer customer) {
		try {
			if(customerCheckService.checkRealPerson(customer)) {
				
				super.save(customer);
				
			} else {
				System.out.println("Kayýt Ýþlemi baþarýsýz");
				
				
		 }
		} catch (NumberFormatException e) {
		
			e.printStackTrace();
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
			
		
		
	}

	
	
	
	
	

	
	

	
  
}
