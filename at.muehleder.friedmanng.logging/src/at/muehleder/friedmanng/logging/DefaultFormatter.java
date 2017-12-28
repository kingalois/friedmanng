package at.muehleder.friedmanng.logging;

import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class DefaultFormatter extends Formatter {
	
	private static final String SPACE = " ";
	private static final String PRAEFIX_FOR_LOGGERNAME = " : [";
	private static final String CLOSING_BRACKETS = "] ";

	@Override
	public String format(LogRecord record) {
		return new Date(record.getMillis()).toString() + SPACE + record.getLevel().getName() + PRAEFIX_FOR_LOGGERNAME
				+ record.getLoggerName() + CLOSING_BRACKETS + record.getMessage() + System.lineSeparator();
	}

}
