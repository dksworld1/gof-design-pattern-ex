package desing.pattern.creational.singleton;

public class Test {

	static {
		System.out.println("init static area.");
	}
	
	public static void main(String[] args) {
		System.out.println("main start.");
		
		Hellobot bot = Hellobot.getInstance();
		bot.sayHello();

	}

}
