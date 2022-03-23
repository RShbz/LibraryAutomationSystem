package library;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.sahabt.library.domain.admin.Address;
import com.sahabt.library.domain.admin.AddressType;
import com.sahabt.library.domain.admin.Admin;
import com.sahabt.library.domain.admin.Email;
import com.sahabt.library.domain.admin.EmailType;
import com.sahabt.library.domain.admin.Phone;
import com.sahabt.library.domain.admin.PhoneType;



public class AdminTest {

	@Test 
	void test() {
		
		var email= Email.of("fake@email.com",EmailType.PERSONAL );
		var phone= Phone.of("555 55 55", PhoneType.WORK);
		var address = Address.of("t�rkiye","Ankara","�mraniye","nam�k kemal", "18", "5", AddressType.HOME);
		
		var admin1 = new Admin.Builder()
				  .identityNo("2222")
				  .fullName("�nce","Memed")
				  .birthDate(23,05,1960)
				  .photo(null)
				  .status("ADMIN")
				  .contact(email,
						  phone,  
						  address)
				  .build();
		//System.out.println(admin1.getStatus());
		
		assertEquals("2222", admin1.getIdentityNo().getIdentityNo());
		assertEquals("�nce" ,admin1.getFullName().getFirstName());
		assertEquals("Memed" ,admin1.getFullName().getLastName());
		assertEquals(23 ,admin1.getBirthDate().getDay());
		assertEquals(05, admin1.getBirthDate().getMount());
		assertEquals(1960, admin1.getBirthDate().getYear());
		assertEquals(null, admin1.getPhoto().getValue());
		assertEquals("ADMIN", admin1.getStatus().toString());
		assertEquals(email, admin1.getContact().getEmail());
		assertEquals(phone, admin1.getContact().getPhone());
		assertEquals(address, admin1.getContact().getAddress());
		
	}

}
