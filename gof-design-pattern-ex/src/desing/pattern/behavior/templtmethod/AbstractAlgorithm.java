package desing.pattern.behavior.templtmethod;

public abstract class AbstractAlgorithm {
	abstract protected Object preProcess();
	abstract protected Object mainProcess();
	abstract protected Object postProcess();
	abstract protected Object getResult();
	
	public Object run() {
		preProcess();
		postProcess();
		mainProcess();
		return getResult();
	}
}
