package desing.pattern.structure.decorator;

public class HorizontalScrollBarDecorator extends WindowDecorator {

	public HorizontalScrollBarDecorator(Window toBeDecorated) {
		super(toBeDecorated);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		this.toBeDecorated.draw();
		System.out.println("Draw HorizontalScrollBar for decoration");
	}

	@Override
	public String getDescrption() {
		// TODO Auto-generated method stub
		return this.toBeDecorated.getDescrption() + ", including HorizontalScrollBar";
	}

}
