package desing.pattern.behavior.state;

public class DemoOfClientState {
    public static void main(String[] args) {
    	
    	/**
    	 * 상태객체 에서 setStateContex 하여 상태를 변경. 상태에 따라 같은 메서드(예제에서 writeName)를 호출하더라도
    	 * 각각의 고유 방식으로 동작하도록 설계.
    	 */
    	
    	final StateContext sc = new StateContext();

        sc.writeName("Monday");
        sc.writeName("Tuesday");
        sc.writeName("Wednesday");
        sc.writeName("Thursday");
        sc.writeName("Friday");
        sc.writeName("Saturday");
        sc.writeName("Sunday");
        
    }
}