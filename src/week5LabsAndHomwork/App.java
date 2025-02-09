package week5LabsAndHomwork;
import java.io.*;
import java.util.*;

public class App {

	public static void main(String[] args) {

		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Type the log text to print out:  "); // This allows the user to input simulated text to log.
		String logText = kb.nextLine();
		
		System.out.println("Logs:"); // This instantiates the log methods.
		asteriskLogger.log(logText);
		spacedLogger.log(logText);
		
		kb = new Scanner(System.in);
		System.out.println("Type the error text to print out:  "); // This allows the user to input simulated error text.
		String errorText = kb.nextLine();

		System.out.println();
		System.out.println("Errors:"); // This instantiates the error methods.
		asteriskLogger.error(errorText); 
		spacedLogger.error(errorText);
		
		kb.close(); // This closes the keyboard scanner.
	}// main

} // class
