package desing.pattern.creational.factorymethod;

import java.text.MessageFormat;

public class Test {

	/**
	 * factory method pattern
	 * ���ø� �޼��� �������� �پ��� Pizza�� �����ϰ� ���丮 Ŭ������ ���� ��ü�� �����ϴ� ����.
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
