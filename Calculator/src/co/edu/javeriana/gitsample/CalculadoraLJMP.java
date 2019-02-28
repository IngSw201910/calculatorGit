package co.edu.javeriana.gitsample;

public class CalculadoraLJMP implements ICalculator {

	@Override
	//SUMA
	public double add(double a, double b) {
		
		return a+b;
	}

	@Override
	//RESTA
	public double substract(double a, double b) {
		
		return a-b;
	}

	@Override
	//MULTIPLICACION
	public double multiply(double a, double b) {
		
		return a*b;
	}

	@Override
	//DIVISION
	public double divide(double a, double b) {
		
		return a/b;
	}

	@Override
	//ACERCA DE...
	public String about() {
		
		return "Calculator implemented by LJMP";
	}

}
