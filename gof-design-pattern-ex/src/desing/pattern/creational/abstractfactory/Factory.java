package desing.pattern.creational.abstractfactory;

public class Factory implements ProductFactory {

	@Override
	public Product1 createProduct1() {
		// TODO Auto-generated method stub
		return new Product1Impl();
	}

	@Override
	public Product2 createProduct2() {
		// TODO Auto-generated method stub
		return new Product2Impl();
	}

}
