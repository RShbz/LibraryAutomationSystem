package com.sahabt.library.domain.booking;

import com.sahabt.library.domain.annotations.Aggregate;
import com.sahabt.library.domain.catalog.ISBN;
import com.sahabt.library.domain.user.IdentityNo;
@Aggregate(id="")
public class Booking {
	
	private IdentityNo identityNo;
	private ISBN isbn;
	private IsBooking isBooking;
}