package desing.pattern.behavior.chain;

public class ChainRespTest {
	public static void main(String[] args) {
		Logger logger, logger2;
		logger = logger2 = new StdoutLogger(Logger.DEBUG);
		
		//logger to chain logger stdout -> file
		logger.setNext(new FileLogger(Logger.NOTICE));
		
		//logger1 to chain logger stdout -> file -> db
		logger2.setNext(new FileLogger(Logger.NOTICE)).setNext(new DBLogger(Logger.ERR));
	
		System.out.println(">>> logging test using chain logger stdout -> file");
		System.out.println("*** message level=DEBUG logging start.");
		logger.message("this is debug msg", Logger.DEBUG);
		System.out.println("*** message level=NOTICE logging start.");
		logger.message("this is notice msg", Logger.NOTICE);
		
		System.out.println(">>> logging test using chain logger stdout -> file -> DB");
		System.out.println("*** message level=DEBUG logging start.");
		logger2.message("this is debug msg", Logger.DEBUG);
		System.out.println("*** message level=NOTICE logging start.");
		logger2.message("this is notice msg", Logger.NOTICE);
		System.out.println("*** message level=ERR logging start.");
		logger2.message("this is err msg", Logger.ERR);
	}
}
