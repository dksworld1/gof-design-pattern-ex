package desing.pattern.structure.composite;

public class CompsitePatternTest {
	public static void main(String[] args) {
		Composite comp1 = new Composite("comp1");
		comp1.addChild(new Leaf("leaf1"));
		comp1.addChild(new Leaf("leaf2"));
		
		Composite comp2 = new Composite("comp2");
		comp2.addChild(new Leaf("leaf3"));
		
		comp1.addChild(comp2);
		
		comp1.operation();
	}
}
