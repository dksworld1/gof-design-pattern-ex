package desing.pattern.behavior.templtmethod;

public class Algorithm2 extends AbstractAlgorithm {

	@Override
	protected Object preProcess() {
		System.out.println("Algorithm2 preProcess");
		return null;
	}

	@Override
	protected Object mainProcess() {
		System.out.println("Algorithm2 mainProcess");
		return null;
	}

	@Override
	protected Object postProcess() {
		System.out.println("Algorithm2 postProcess");
		return null;
	}

	@Override
	protected Object getResult() {
		return "Algorithm2 result";
	}

}
