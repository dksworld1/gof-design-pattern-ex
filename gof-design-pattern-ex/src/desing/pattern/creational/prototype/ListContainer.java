package desing.pattern.creational.prototype;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class ListContainer implements Prototype {
	private List<String> list;
	private String name;
	
	public String toString() {
		String pattern = "ListContainer@{0} [list={1}, name={2}]";
		String listToStr = list.getClass().getSimpleName() + "@" + list.hashCode() + " 0_detail=[String@"+ list.get(0).hashCode() +"="+ list.get(0) +"] " + list.toString();
		String nameToStr = "String@" + name.hashCode() + "=" + name;
		return MessageFormat.format(pattern, Integer.toString(hashCode()), listToStr, nameToStr);
	}
	
	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public ListContainer deepcopy() {
		ListContainer dc = new ListContainer();
		
		List<String> list = null;
		if(this.list != null) {
			list = new ArrayList<>();
			list.addAll(this.list);
		}
		
		dc.setList(list);
		dc.setName(this.name);
		
		return dc;
	}
	
	public ListContainer clone() {
		ListContainer clone = new ListContainer();
		clone.setList(this.list);
		clone.setName(this.name);
		return clone;
	}
}
