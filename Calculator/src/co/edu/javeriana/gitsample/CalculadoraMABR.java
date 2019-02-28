package co.edu.javeriana.gitsample;

public class CalculadoraMABR implements ICalculator {

	public CalculadoraMABR() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double add(double a, double b) {
		return a+b;
	}

	@Override
	public double substract(double a, double b) {
		return a-b;
	}

	@Override
	public double multiply(double a, double b) {
		return a*b;
	}

	@Override
	public double divide(double a, double b) {
		return a/b;
	}

	@Override
	public String about() {
		return "Calculator implementend by "+Authors.MABR;
	}

}
