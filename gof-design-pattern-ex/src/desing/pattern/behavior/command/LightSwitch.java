package desing.pattern.behavior.command;

public class LightSwitch {
	
	private boolean isDown = true;
	private TurnOnLightCommand turnOnLightCommand;
	private TurnOffLightCommand turnOffLightCommand;
	
	public LightSwitch(TurnOnLightCommand turnOnLightCommand, TurnOffLightCommand turnOffLightCommand) {
		this.turnOnLightCommand = turnOnLightCommand;
		this.turnOffLightCommand = turnOffLightCommand;
	}
	
	public void flipUp() {
		System.out.println(">>> try to flip switch up.");
		if(!isDown) {
			System.out.println("switch is already up.");
			return;
		}	
		this.turnOnLightCommand.execute();
		this.isDown = false;
		System.out.println("light switch flipped up.");
	}
	
	public void flipDown() {
		System.out.println(">>> try to flip switch down.");
		if(isDown) {
			System.out.println("switch is already down.");
			return;
		}
		this.turnOffLightCommand.execute();
		this.isDown = true;
		System.out.println("light switch flipped down.");

	}
}
