package Concrete;

import Abstract.CustomerService;
import Entities.Customer;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		
		System.out.println(customer.getFirstName()+ " Veritabanýna Kaydedildi");
		
	}
	

}
