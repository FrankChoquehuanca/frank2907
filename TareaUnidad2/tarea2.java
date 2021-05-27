package TareaUnidad2;

import java.util.Scanner;

public class tarea2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cubo, un_numero;
        
            System.out.print("Ingresa el valor de un numero: ");
            un_numero = in.nextDouble();
            in.nextLine();
            cubo=un_numero*un_numero*un_numero;
            System.out.println("Valor de cubo: " + cubo);
        
    }
}            
              
        


