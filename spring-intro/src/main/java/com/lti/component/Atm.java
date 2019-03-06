package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("atm")
public class Atm implements Atminterface  {

	@Autowired // dependency 
	private Bankinterface bank;
	
	/* (non-Javadoc)
	 * @see com.lti.component.Atminterface#atmcard(long, double)
	 */
	public void atmcard(long acno,double amount) {
		System.out.println("you can withdraw now");
	bank.communicate("Sbi-123",null);
	}
}
