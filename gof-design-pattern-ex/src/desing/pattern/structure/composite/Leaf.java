package desing.pattern.structure.composite;

import java.text.MessageFormat;

public class Leaf implements Component {
	private String id;
	
	public Leaf(String id) {
		this.id = id;
	}
	
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println(MessageFormat.format("Leaf(id={0}) operation finished.", this.id));
	}

}
