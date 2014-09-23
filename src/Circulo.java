
public class Circulo {

	static final double NUM_PI = 3.1416;

	double radio;

	//Método que dado el radio calcula la circunferencia de un círculo.
	public double circunferencia(double radio) {

		double result;

		result = 2*NUM_PI*radio;

		return result;
	}

	//Método que dado el radio calcula el area de un círculo.
	public double area(double radio) {

		double result;

		result = NUM_PI*radio*radio;

		return result;
	}
}
