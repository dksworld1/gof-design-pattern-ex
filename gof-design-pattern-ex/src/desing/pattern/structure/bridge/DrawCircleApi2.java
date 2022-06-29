package desing.pattern.structure.bridge;

public class DrawCircleApi2 implements DrawApi {

	@Override
	public void drawCircle(double x, double y, double radius) {
		// TODO Auto-generated method stub
		System.out.println(String.format("DrawCircleApi2 (x=%f, y=%f, radius=%f", x, y, radius));
	}
	
}
