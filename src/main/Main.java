package main;

import abstracts.BaseCustomerManager;
import adaptors.MernisAdaptor;
import concretes.NeroCustomerManager;
import concretes.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
		baseCustomerManager.save(new Customer("1","ali","temel","v",1988));
		
		BaseCustomerManager baseCustomerManager2 = new StarbucksCustomerManager(new MernisAdaptor());
		baseCustomerManager2.save(new Customer("1","ahmet","temel","153********",1988));
	}

}
