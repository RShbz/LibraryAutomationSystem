package library;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.sahabt.library.domain.borrow.Borrow;
import com.sahabt.library.domain.catalog.Catalog;
import com.sahabt.library.domain.credicard.CrediCard;
import com.sahabt.library.domain.credicard.ExpirationDate;

public class BorrowTest {

	@Test
	void test() {
		
	var fake = new Borrow.Builder()
			.identityNo("11515")
			.isbn("tr0505")
			.deadline(02, 03, 2021)
			.date(02, 03, 2021)
			.punishment(0)
			.borrowCounter(0)
			.build();
	}
	
	

}
