package desing.pattern.creational.builder;

public class Test {
	public static void main(String[] args) {
		Player p1 = new Player.Builder("bot", "tanker")
						.setHp(100)
						.setMp(100)
						.build();
		
		System.out.println(p1);
	}
}
