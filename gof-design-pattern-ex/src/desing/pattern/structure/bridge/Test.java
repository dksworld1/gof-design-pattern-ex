package desing.pattern.structure.bridge;

public class Test {

	public static void main(String[] args) {
		/**
		 * abstract를 구현할 interface를 정의한 패턴
		 * Shape 과 DrawApi
		 * abstract가 브릿지 역할을 해준다.
		 */
		
		DrawApi api1 = new DrawCircleApi1();
		DrawApi api2 = new DrawCircleApi2();
		CircleShape circle1 = new CircleShape(0, 0, 5, api1);
		CircleShape circle2 = new CircleShape(0, 0, 5, api2);
		
		circle1.resizeByPercentage(30);
		circle1.draw();
		
		circle2.resizeByPercentage(150);
		circle2.draw();
	}

}
