package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println(customer.getFirstName()+" "+customer.getLastName()+" saved to database");		
	}
	
}


