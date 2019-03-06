package com.lti.component;

import org.springframework.stereotype.Component;

@Component("bank")
public class Bank implements Bankinterface {
	
	/* (non-Javadoc)
	 * @see com.lti.component.Bankinterface#communicate(java.lang.String, byte[])
	 */
	public void communicate(String atmid,byte[] data) {
		System.out.println("atm card accepted for the specified bank and transaction can begin");
	}

}
