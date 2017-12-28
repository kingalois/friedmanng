package at.muehleder.friedmanng.logging;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;

import org.junit.Test;

public class LoggerFactoryTest {
	
	
	@Test
	public void test() {
		Logger logger = LoggerFactory.makeLogger();
		
		assertNotNull(logger);
		assertEquals(this.getClass().getName(), logger.getName());
		assertTrue(logger.getUseParentHandlers());
		assertEquals(2,logger.getParent().getHandlers().length); //the parent logger (root logger) must have 2 handler (console and file handler)
	}

}
