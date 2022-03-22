package com.sahabt.library.domain.payment;

import com.sahabt.library.domain.annotations.Aggregate;
import com.sahabt.library.domain.user.IdentityNo;

@Aggregate(id="")
public class Payment {
	
	private IdentityNo identityNo; // from user
	private Fullname fullname; //from user
	private CreditCard creditCard; // from credit card
	private ProcessType processType; // this class enum who include punishment etc.
}
