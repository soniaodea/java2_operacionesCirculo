
import java.util.Scanner;

public class OperacionesCirculo {

	public static void main (String[] args) {
	
	  double radio;
          double result;
	  Circulo circulo = new Circulo();

	  Scanner sc = new Scanner(System.in);
          System.out.print("\ningresa el radio: ");
          radio = sc.nextDouble();

	
	  result =  circulo.circunferencia(radio);
	  System.out.println("La circunferencia es: " + result); 
			
	  result =  circulo.area(radio);
	  System.out.println("El area es: " + result); 
	}

}
