package desing.pattern.creational.factorymethod;

public class PizzaFactory {
	public final static String PIZZA_TYPE_MUSHROOM = "MUSHROOM_PIZZA";
	public final static String PIZZA_TYPE_PLAIN = "PLAIN_PIZZA";
	
	public static Pizza create(String pizzaType) {
		Pizza pizza = null;
		switch (pizzaType) {
		case PIZZA_TYPE_MUSHROOM:
			pizza = new MushroomPizza();
			break;			
		case PIZZA_TYPE_PLAIN:
			pizza = new PlainPizza();
			break;
		default:
			throw new RuntimeException("Not support pizza type: " + pizzaType);
		}
		
		return pizza;
	}
}
