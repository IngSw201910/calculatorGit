package co.edu.javeriana.gitsample;

public class CalculadoraSACP  implements ICalculator {
	
	double sumar(double a, double b)
	{
		return (a+b);
	}
	double restar(double a, double b)
	{
		return (a-b);
	}
	double dividir(double a, double b)
	{
		return (a/b);
	}
	double multiplicar(double a, double b)
	{
		return (a*b);
	}
	String about()
	{
		return "Calculator implemented by SACP";
	}
}
