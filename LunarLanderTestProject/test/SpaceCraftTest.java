import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SpaceCraftTest {

	SpaceCraft sc;
	
	@Before
	public void setUp() throws Exception {
		sc = new SpaceCraft();
	}

	@After
	public void tearDown() throws Exception {
		sc = null;
	}

	@Test
	public void InitTest() {
		sc.init();
		assertEquals(1000, sc.getAltitude());
		assertEquals(500, sc.getFuel());
		assertEquals(70, sc.getVelocity());
		assertEquals(0, sc.time);
		assertEquals(0, sc.getBurnRate());

	}

}
