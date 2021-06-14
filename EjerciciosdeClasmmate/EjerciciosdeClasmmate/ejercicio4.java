package EjerciciosdeClasmmate;

import java.util.Scanner;

public class ejercicio4 {
    static Scanner teclado=new Scanner(System.in);
    public static void main(String[] arg){
    int variable1 , variable2;
    System.out.println("Ingrese la variable1");  
    variable1=teclado.nextInt();
    System.out.println("Ingrese la variable2");
    variable2=teclado.nextInt();
    if (variable1>variable2) {
        System.out.println("El numero mayor es: "+variable1);
    }
    else {
        System.out.println("El numero mayor es: "+variable2);
    }
}
}
