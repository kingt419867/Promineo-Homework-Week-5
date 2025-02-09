package week5LabsAndHomwork;

public class SpacedLogger implements Logger {

	@Override
	public void log(String logItem) { // This implements the log method.
		for (int i=0; i < logItem.length(); i++) {
			char c = logItem.charAt(i);		// This will parse the logItem input, putting a space between each character.
			System.out.print(c + " ");
		} // for
		System.out.println();
	} // method

	@Override
	public void error(String error) { // This implements the error method.
		System.out.print("ERROR:  ");
		for (int i=0; i < error.length(); i++) {
			char c = error.charAt(i);		// This will parse the error input, putting a space between each character, after the code word "ERROR: ".
			System.out.print(c + " ");
		} // for
		System.out.println();
	} // method

} // class
