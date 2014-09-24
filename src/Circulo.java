
public class Circulo {

	static final double NUM_PI = 3.1416;

	private double radio;

	//Método que dado el radio calcula la circunferencia de un círculo.
	//public double circunferencia(double radio) {
	public double circunferencia() {

		double result;

		result = 2*NUM_PI*radio;

		return result;
	}

	//Método que dado el radio calcula el area de un círculo.
	//public double area(double radio) {
	public double area() {

		double result;

		result = NUM_PI*radio*radio;

		return result;
	}

	public double getRadio() {

		return radio;
	}	

	public void setRadio(double rad) {

		radio = rad;
	} 
}
