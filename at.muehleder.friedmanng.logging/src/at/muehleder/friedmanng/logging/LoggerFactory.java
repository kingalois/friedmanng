package at.muehleder.friedmanng.logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class LoggerFactory {
	
	private static final String LOGGER_NAME_PRAEFIX = "at.muehleder"; 
	
	static {
		Logger log = Logger.getLogger(LOGGER_NAME_PRAEFIX);
		for (Handler h : log.getHandlers()) {
			log.removeHandler(h);
		}
		Handler consoleHandler = new ConsoleHandler();
		consoleHandler.setFormatter(new DefaultFormatter());

		try {
			FileHandler fileHandler = new FileHandler(LoggingContants.FILENAME_PATTERN, LoggingContants.FILESIZE_10MB, LoggingContants.NR_OF_FILES, true);
			fileHandler.setFormatter(new DefaultFormatter());
			log.addHandler(fileHandler);
		} catch (Exception e) {
			System.out.println("error during creating file handler for logging: " + e.getMessage());
		} 
		log.addHandler(consoleHandler);
	}

	public static Logger makeLogger() {
		Throwable th = new Throwable();
		Logger logger = Logger.getLogger(th.getStackTrace()[1].getClassName());
		logger.setUseParentHandlers(true);
		return logger;
	}


}
