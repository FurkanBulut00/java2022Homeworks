package kodlamaIo.core.loggers;

public class LogHelper {

	private Logger[] loggers;

	public LogHelper(Logger[] loggers) {
		super();
		this.loggers = loggers;
	}

	public void log(String message) {

		for (Logger logger : loggers) {
			logger.log(message);
		}
	}

}
