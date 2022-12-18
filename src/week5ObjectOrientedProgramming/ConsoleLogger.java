package week5ObjectOrientedProgramming;

import java.util.Date;

public class ConsoleLogger implements Logger{
	// Once we implemented Logger Interface, Java told us we must implement the inherited abstract methods from/in Logger
		// and gave us the choice to do that. The implementation here shows up as @Override so we know it is overriding methods from Logger.

	@Override
	public void info(String info) {
		Date date = new Date();
		System.out.println(date.toString() + " " + info);
	}

	@Override
	public void warning(String warning) {
		Date date = new Date();
		System.out.println(date.toString() + " Warning - " + warning);
	}

	@Override
	public void error(String error) {
		Date date = new Date();
		System.err.println(date.toString() + " Error - " + error);							// Note use of System.err instead of System.out
	}

	@Override
	public void fatal(String fatal) {
		Date date = new Date();
		System.err.println(date.toString() + " FATAL!!!! - " + fatal.toUpperCase());			// Note use of System.err instead of System.out
	}

	@Override
	public void close() {
		// Console logger doesn't need to close anything so nothing happens here. FileLogger does need to close the file.
	}
	

	

	
	
	
	
	
	
} // end CLASS
