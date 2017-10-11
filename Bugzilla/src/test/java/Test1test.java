import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test1test {
private Test1 obj;
	@Before
	public void setUp() throws Exception {
		obj=new Test1();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSubtract() {
		long ans=15-9-8-1;
		assertEquals(ans,obj.subtract(15,9,8,1));
		ans = 95 - 79;
		assertEquals(ans, obj.subtract(95,79));
		ans = 43-22;
		assertEquals(ans, obj.subtract(43,22));
		
	}

}
