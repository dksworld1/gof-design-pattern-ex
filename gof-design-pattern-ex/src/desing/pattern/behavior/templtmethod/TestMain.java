package desing.pattern.behavior.templtmethod;

public class TestMain {

	public static void main(String[] args) {
		AbstractAlgorithm algo1 = new Algorithm1();
		AbstractAlgorithm algo2 = new Algorithm2();
		
		System.out.println("*** alog1 run.");
		System.out.println("alog1 result: " + algo1.run());
		
		System.out.println("*** alog2 run.");
		System.out.println("alog2 result: " + algo2.run());
	}

}
