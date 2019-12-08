import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GameControllerTest {

	private GameController gc;
	
	
	@Before
	public void setUp() throws Exception {
		gc = new GameController();
	}

	@After
	public void tearDown() throws Exception {
		gc = null;
	}

	@Test
	public void testGameController() {
		assertNotNull(gc.getSpaceCraft());
	}

	@Test
	public void testCheckGameResultAltitude() {
		gc.getSpaceCraft().setAltitude(10);
		assertEquals(0,gc.checkGameResult());
	}
	
	@Test
	public void testCheckGameResultVelocity() {
		gc.getSpaceCraft().setAltitude(0);
		gc.getSpaceCraft().setVelocity(5);
		assertEquals(1,gc.checkGameResult());
	}

}
