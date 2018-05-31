package ClassCodingGroup;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		Person p = new Person();
		p.setFirstName("James");
		p.setLastName("Smithers");
		
		assertEquals("James", p.getFirstName());
		assertFalse("Smitts", false);
	}

}
