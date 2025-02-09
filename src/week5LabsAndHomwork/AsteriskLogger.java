package week5LabsAndHomwork;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String logItem) {			// This implements the log method.
		System.out.println("***" + logItem + "***");
		System.out.println();
	}// log

	@Override
	public void error(String error) {			// This implements the error method.
		System.out.println("****************");
		System.out.println("***" + error + "***");
		System.out.println("****************");
		System.out.println();
	}// error

	
	
} // class
