package desing.pattern.structure.bridge;

public class CircleShape implements Shape {
	private double x;
	private double y;
	private double radius;
	private DrawApi drawApi;
	
	public CircleShape(double x, double y, double radius, DrawApi drawApi) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.drawApi = drawApi;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		drawApi.drawCircle(x, y, radius);
	}

	@Override
	public void resizeByPercentage(double pct) {
		// TODO Auto-generated method stub
		radius *= pct/100;
	}

}
