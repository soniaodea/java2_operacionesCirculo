
import java.util.Scanner;

public class OperacionesCirculo {

	public static void main (String[] args) {
	
	  double radio;
          double result;
	  Circulo circulo = new Circulo();

	  Scanner sc = new Scanner(System.in);
          System.out.print("\ningresa el radio: ");
          radio = sc.nextDouble();
	  
	  circulo.setRadio(radio);

	
	  result =  circulo.circunferencia();
	  System.out.println("La circunferencia es: " + result); 
			
	  result =  circulo.area();
	  System.out.println("El area es: " + result); 
	}

}
