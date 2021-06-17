

import java.util.Scanner;

public class ejercicio2 {
    static Scanner teclado=new Scanner(System.in);
    public static void hola(){
        int contador=1,cantidad;
        System.out.println("Ingrese la cantidad de saludos");
        cantidad=teclado.nextInt();
        while (contador<=cantidad){
            System.out.println(contador+"Hola a todos");
            contador++;
        }
    }
    public static void main(String[] args) {
        hola();
}
}

