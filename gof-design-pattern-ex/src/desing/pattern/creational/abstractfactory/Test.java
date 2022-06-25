package desing.pattern.creational.abstractfactory;

public class Test {

	public static void main(String[] args) {
		ProductFactory factory = null;
		
		String[] factoryNames = new String[] {ProductFactoryProvider.FACTORY1, ProductFactoryProvider.FACTORY2};
		
		for(String name : factoryNames) {
			factory = ProductFactoryProvider.get(name);
			factory.createProduct1().print();
			factory.createProduct2().print();	
		}
		
	}

}
