package desing.pattern.behavior.templtmethod;

public class Algorithm1 extends AbstractAlgorithm {

	@Override
	protected Object preProcess() {
		System.out.println("Algorithm1 preProcess");
		return null;
	}

	@Override
	protected Object mainProcess() {
		System.out.println("Algorithm1 mainProcess");
		return null;
	}

	@Override
	protected Object postProcess() {
		System.out.println("Algorithm1 postProcess");
		return null;
	}

	@Override
	protected Object getResult() {
		return "Algorithm1 result";
	}

}
