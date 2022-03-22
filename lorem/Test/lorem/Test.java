package lorem;

import lorem.domain.Lorem;


public class Test {
	
	@Test
	void test() {
		var lorem1 = new Lorem.Builder()
				.identityNo(11223)
				.name("hacý hüseyin")
				.build();
		
		assertEquals(11223,lorem1.getIdentityNo());
		assertEquals("hacý hüseyin",lorem1.getName());
		
	}
}
