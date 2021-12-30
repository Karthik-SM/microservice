package com.practise.restful.restfulDemo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@GetMapping(value="/getCustomer/{id}")
	public Customer getCustomer(@PathVariable Integer id)
	{
		Map<Integer,String> custMap = new HashMap<Integer, String>();
		custMap.put(1,"Karthik");
		custMap.put(2,"Sangi");
		if(custMap.containsKey(id))
		{
			Customer cust = new Customer();
			cust.setId(id);
			cust.setName(custMap.get(id));
			return cust;
		}
		else
			throw new CustomerNotFoundExpception(id+" Customerid Not Exits");
	}
}
