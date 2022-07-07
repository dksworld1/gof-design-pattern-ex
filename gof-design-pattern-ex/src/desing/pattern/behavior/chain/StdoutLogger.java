package desing.pattern.behavior.chain;

public class StdoutLogger extends Logger {
	public StdoutLogger(int mask) {
		this.mask = mask;
	}
	
	@Override
	protected void writeMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("log on stdout. msg=" + msg);
	}

}
