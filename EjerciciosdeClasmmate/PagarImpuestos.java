package EjerciciosdeClasmmate;
import java.util.Scanner;

public class PagarImpuestos {
	static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) { 
		
    	float sueldo;
    	System.out.print("Ingrese el sueldo:");
    	sueldo=teclado.nextFloat();
    	if (sueldo>5000) {
    	    System.out.println("Debe pagar impuestos");
    	}
		else {
			System.out.println("No debe pagar impuestos");
		}
   }
}
