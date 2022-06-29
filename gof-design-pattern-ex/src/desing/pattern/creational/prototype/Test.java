package desing.pattern.creational.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		ListContainer lc = new ListContainer();
		List<String> list = new ArrayList<>(Arrays.asList(new String[] {"aaa", "bbb", "ccc"}));
		lc.setList(list);
		lc.setName("test");

		ListContainer lc2 = lc.deepcopy();
		System.out.println("lc  => " + lc);
		System.out.println("lc2 => " + lc2);
		
		System.out.println("after add to list of lc2.");
		lc2.getList().add("eee");
		System.out.println("lc  => " + lc);
		System.out.println("lc2 => " + lc2);
		
		System.out.println();
		System.out.println("*** clone case ***");
		ListContainer lc3 = lc.clone();
		System.out.println("lc  => " + lc);
		System.out.println("lc3 => " + lc3);
		
		System.out.println("after add to list of lc3.");
		lc3.getList().add("eee");
		System.out.println("lc  => " + lc);
		System.out.println("lc3 => " + lc3);
		
	}

}
