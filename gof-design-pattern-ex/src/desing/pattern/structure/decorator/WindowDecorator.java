package desing.pattern.structure.decorator;

public abstract class WindowDecorator implements Window {
	protected Window toBeDecorated;
	public WindowDecorator(Window toBeDecorated) {
		this.toBeDecorated = toBeDecorated;
	}
}
