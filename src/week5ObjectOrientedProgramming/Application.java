package week5ObjectOrientedProgramming;

import java.util.ArrayList;
import java.util.List;

public class Application {
	
	static Logger logger;			// declares a Logger variable  called logger - not an instantiaton because "new" keyword isn't used.

	public static void main(String[] args) {
		
		// Interface on left side = Class name on right side 
		List<String> list = new ArrayList<String>();
		
		// This line does not work because Logger is an interface and interfaces cannot be implemented
		//Logger logger = new Logger();
		
		Logger logger = new ConsoleLogger();			// Because Logger is an interface, the ConsoleLogger can be switched out
		logger.info("Hello");								// with any other class that implements Logger because they all have the same
		logger.warning("This is a warning");				// methods as Logger. The only thing I had to do to make it work was change
		logger.error("Oops, this is an error!");			// the name of the object created to logger2.
		logger.fatal("Fatal error");
															
		Logger logger2 = new FileLogger();
		logger2.info("Hello");
		logger2.warning("This is a warning");
		logger2.error("Oops, this is an error!");
		logger2.fatal("Fatal error");
		
		logger2.close();
		
		// for some reason, these 2 lines also break my logs.txt file, so I commented them out.
		//setLogger(new FileLogger());					// NOTE referenced in Logger. These 2 lines allow us to pass in any class that implements the Logger Interface.
		//setLogger(new ConsoleLogger());						// See explanation in Logger about coding to an Interface.

		

	} // end MAIN
	
	private static void setLogger(Logger l) {
		logger = l;
	}

} // end CLASS
