package desing.pattern.behavior.chain;

public class DBLogger extends Logger {

	public DBLogger(int mask) {
		this.mask = mask;
	}
	
	@Override
	protected void writeMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("log on DB. msg=" + msg);
	}

}
