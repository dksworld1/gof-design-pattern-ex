package desing.pattern.creational.abstractfactory;

public class Factory2 implements ProductFactory {

	@Override
	public Product1 createProduct1() {
		// TODO Auto-generated method stub
		return new ProdA();
	}

	@Override
	public Product2 createProduct2() {
		// TODO Auto-generated method stub
		return new ProdB();
	}

}
