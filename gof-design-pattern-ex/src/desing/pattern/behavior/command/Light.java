package desing.pattern.behavior.command;

public class Light {
	enum Power {
		ON,
		OFF
	}
	
	private String name;	
	private Power power = Power.OFF;

	public Light(String name) {
		this.name = name;
	}
	
	public Power getPower() {
		return power;
	}

	public void setPower(Power power) {
		System.out.println("light power will be changed " + this.power + " to " + power);
		this.power = power;
	}

}
