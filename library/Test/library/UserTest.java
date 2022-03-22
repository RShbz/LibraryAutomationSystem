package library;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;

import com.sahabt.library.domain.catalog.Catalog;
import com.sahabt.library.domain.user.BirthDate;
import com.sahabt.library.domain.user.Contact;
import com.sahabt.library.domain.user.FullName;
import com.sahabt.library.domain.user.IdentityNo;
import com.sahabt.library.domain.user.Photo;
import com.sahabt.library.domain.user.Status;
import com.sahabt.library.domain.user.User;

public class UserTest {

	@Test
	void test() {
		
		
		var jack = new User.Builder()
				  .identityNo("111111")
				  .fullName("Jack", "Bauer")
				  .birthDate(new Date(1999))
				  .photo(null)
				  .status("TEACHER")
				  .contact("fake@email.com","WORK", 
						  "555 555 55 55","WORK", 
						  "t�rkiye","istanbul","�mraniye","nam�k kemal","18","55","WORK")
				  .build();
	}

}