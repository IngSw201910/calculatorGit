
package co.edu.javeriana.gitsample;

public class Main {
	
	public static void main(String args[]){
		//Create calculator implementation
		ICalculator d = new CalculadoraDBS();
		System.out.println(d.add(4, 5));
		ICalculator n = new CalculatorNDO();
		System.out.println(n.divide(899, 3));
		
		//c.substract (100.5, 200);
		//Other operations
	}

	
}
