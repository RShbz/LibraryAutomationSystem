package com.sahabt.library.domain.booking;

import com.sahabt.library.domain.annotations.Aggregate;
import com.sahabt.library.domain.user.IdentityNo;
@Aggregate(id="bookId")
public class Booking {
	
	private IdentityNo identityNo;
	private BookId bookId;

}
