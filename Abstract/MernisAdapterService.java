package Abstract;


import java.rmi.RemoteException;

import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapterService implements CustomerCheckService {

	@Override
	public boolean checkRealPerson(Customer customer) throws NumberFormatException, RemoteException  {
		
		KPSPublicSoapProxy xProxy = new KPSPublicSoapProxy();
		
		var result = xProxy.TCKimlikNoDogrula(
				Long.parseLong(customer.getNationalityId()),
				customer.getFirstName(),
				customer.getLastName(),
				customer.getDateOfBirth());
		
		if (result) {
			System.out.println("Kimlik Doðrulandý");
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
	}
	
	
	



