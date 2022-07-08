package desing.pattern.behavior.command;

public class TurnOffLightCommand implements Command {
	private Light light;
	
	public TurnOffLightCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.light.setPower(Light.Power.OFF);
		System.out.println("light turned off.");
	}

}
