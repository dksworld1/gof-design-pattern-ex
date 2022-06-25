package desing.pattern.creational.abstractfactory;

public class ProductFactoryProvider {
	private final static Factory factory1;
	private final static Factory2 factory2;
	static {
		factory1 = new Factory();
		factory2 = new Factory2();
	}
	
	public final static String FACTORY1 = "factory1";
	public final static String FACTORY2 = "factory2";
	
	public static ProductFactory get(String factoryName) {
		ProductFactory factory = null;
		switch (factoryName) {
		case FACTORY1:
			factory = factory1;
			break;

		case FACTORY2:
			factory = factory2;
			break;	
			
		default:
			throw new RuntimeException("Not support factory name [" + factoryName + "]");
		}
		
		return factory;
	}
	
}
