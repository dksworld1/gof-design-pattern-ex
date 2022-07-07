package desing.pattern.behavior.chain;

public class FileLogger extends Logger {

	public FileLogger(int mask) {
		this.mask = mask;
	}
	
	@Override
	protected void writeMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("log on file. msg=" + msg);
	}

}
