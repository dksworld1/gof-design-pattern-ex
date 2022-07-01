package desing.pattern.structure.composite;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
	private List<Component> childList = new ArrayList<>();
	private String id;
	
	public Composite(String id)	{
		this.id = id;
	}
	
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println(MessageFormat.format("Composite(id={0}) operation started.", this.id));
		for(Component c : this.childList) {
			c.operation();
		}
		System.out.println(MessageFormat.format("Composite(id={0}) operation finished.", this.id));
	}
	
	public void addChild(Component child) {
		childList.add(child);
	}

	public void removeChild(Component child) {
		childList.remove(child);
	}
}
