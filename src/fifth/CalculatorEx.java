package fifth;

public class CalculatorEx {

	public static void main(String[] args) {

		System.out.println("calculator.pi: "+Calculator.pi);
		
		add(1,2);
		
		int result = Calculator.addStatic(7, 70);
	}
	public static int add (int a, int b) {
		return a+b;
	}
	public static int minus(int a, int b) {
		int result=add(1,2);
		return a+b;
	}
	

}
