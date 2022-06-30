package desing.pattern.creational.singleton;

public class Hellobot {
	private Hellobot() {
		
	}
	
	public static Hellobot getInstance() {
		System.out.println("get sigleton.");
		return LazyLoader.INSTANCE;
	}

	private static class LazyLoader {
		private final static Hellobot INSTANCE;
		static {
			System.out.println("init LazyLoader static area.");
			INSTANCE = new Hellobot();
		}
	}
	
	public void sayHello() {
		System.out.println("hello world!");
	}

}
