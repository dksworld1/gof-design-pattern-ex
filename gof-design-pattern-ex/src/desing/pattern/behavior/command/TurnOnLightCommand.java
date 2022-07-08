package desing.pattern.behavior.command;

public class TurnOnLightCommand implements Command {
	private Light light;
	
	public TurnOnLightCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.light.setPower(Light.Power.ON);
		System.out.println("light turned on.");
	}

}
