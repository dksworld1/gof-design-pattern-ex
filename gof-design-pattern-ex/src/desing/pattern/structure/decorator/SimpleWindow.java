package desing.pattern.structure.decorator;

public class SimpleWindow implements Window {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw simple window");
	}

	@Override
	public String getDescrption() {
		// TODO Auto-generated method stub
		return "Simple window";
	}

}
