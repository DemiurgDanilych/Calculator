package Calculator;

public class Main {
	public static void main(String[] args) {
		Calculator calc = Calculator.instance.get();

		int a = calc.plus.apply(1,2);
		int b = calc.minus.apply(1,1);

		// ArithmeticException: деление на ноль т.к. b = 0
		int c = calc.device.apply( a , b );

		calc.println.accept(c);
	}
}
