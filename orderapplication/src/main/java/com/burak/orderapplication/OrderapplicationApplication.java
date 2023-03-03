package com.burak.orderapplication;

import com.burak.orderapplication.model.Address;
import com.burak.orderapplication.model.BaseModel;
import com.burak.orderapplication.model.Bill;
import com.burak.orderapplication.repository.BillRepository;
import com.burak.orderapplication.service.AddressService;
import com.burak.orderapplication.service.BillService;
import com.burak.orderapplication.service.CustomerService;
import com.burak.orderapplication.utils.InstanceGenerateUtils;

import java.time.LocalDateTime;

public class OrderapplicationApplication {

	public static void main(String[] args) {
		AddressService addressService=new AddressService();
		BillService billService= new BillService();
		CustomerService customerService= new CustomerService();
		InstanceGenerateUtils.generateInstances(addressService,customerService,billService);

		System.out.println(customerService.getAllCustomers());
		System.out.println(customerService.getCustomersByGivenLetter('C'));
		System.out.println(billService.getAllBills());
		System.out.println(customerService.getCustomersWhichIsRegisteredInJune());
		//System.out.println(billService.getAllNamesOfUnderFiveHundredBills());
		System.out.println(billService.getAvgOfBillsOverOneThousandAndFiveHundred());
		/*System.out.println(billService.
				getSumOfBillsOverOneThousandAndFiveHundredWhichIsRegisteredInJune(customerService.getCustomersWhichIsRegisteredInJune()));*/


	}

}
