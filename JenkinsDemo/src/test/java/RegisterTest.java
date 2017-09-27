import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RegisterTest {
	Register obj;
	int x,y;
	@Before
	public void setUp() throws Exception {
		x=5;
		y=6;
		obj=new Register();
		
	}

	

	@Test
	public void testadd() {
		assertEquals(11,obj.add(x,y));
	}

}
