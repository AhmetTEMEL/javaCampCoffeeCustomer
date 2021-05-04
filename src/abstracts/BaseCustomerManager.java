package abstracts;

import entities.Customer;

public abstract class BaseCustomerManager implements CustomerServices {

	@Override
	public void save(Customer customer) {
		System.out.println("musteri kaydedildi :"+customer.getFirstName());
	}


}
