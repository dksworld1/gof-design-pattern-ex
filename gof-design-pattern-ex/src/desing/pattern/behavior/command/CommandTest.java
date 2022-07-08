package desing.pattern.behavior.command;

public class CommandTest {
	public static void main(String[] args) {
		Light light = new Light("living room light");
		TurnOffLightCommand off = new TurnOffLightCommand(light);
		TurnOnLightCommand on = new TurnOnLightCommand(light);
		LightSwitch swtch = new LightSwitch(on, off);
		swtch.flipUp();
		swtch.flipDown();
		swtch.flipDown();
	}
}
