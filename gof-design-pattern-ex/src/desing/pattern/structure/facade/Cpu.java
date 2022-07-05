package desing.pattern.structure.facade;

public class Cpu {
	public void freeze() {
		System.out.println("cpu freeze");
	}
	
	public void jump(long position) {
		System.out.println("cpu jump position=" + position);
	}
	
	public void execute() {
		System.out.println("cpu execute");
	}
}
