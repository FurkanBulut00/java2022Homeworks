package kodlamaIo.core.loggers;

public class MailLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Maile " + message + " loglandi");

	}

}
