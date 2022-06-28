package desing.pattern.creational.factorymethod;

import java.text.MessageFormat;

public class Test {

	/**
	 * factory method pattern
	 * 템플릿 메서드 패턴으로 다양한 Pizza를 정의하고 팩토리 클래스를 통해 객체를 생성하는 패턴.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pizzaType = PizzaFactory.PIZZA_TYPE_MUSHROOM;
		Pizza pizza = PizzaFactory.create(pizzaType);
		
		System.out.println(String.format("%s has been created. It's price is %.2f$", pizzaType, pizza.getPrice()));
		
		//escape ' -> ''
		String msg = MessageFormat.format("{0} has been created. It''s price is {1}$", pizzaType, pizza.getPrice());
		System.out.println(msg);
	}

}
