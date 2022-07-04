package desing.pattern.structure.decorator;

public class TestDecorator {
	public static void main(String[] args) {
		Window window = new HorizontalScrollBarDecorator(new VerticalScrollBarDecorator(new SimpleWindow()));
		
//      풀어쓰면
//		Window window = new SimpleWindow();
//		window = new VerticalScrollBarDecorator(window);
//		window = new HorizontalScrollBarDecorator(window);
		
		window.draw();
		System.out.println("Window desc: " + window.getDescrption());
	}
}
