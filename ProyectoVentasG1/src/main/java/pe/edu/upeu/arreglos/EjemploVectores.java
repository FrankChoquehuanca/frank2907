package pe.edu.upeu.arreglos;

import java.util.Scanner;
public class EjemploVectores {

    public static void conceptosVectores() {
        //como podemos definir el vector
        int[] vectorX;
        //int []vectorY;
        //como podemos definir el tamaño del vetor
        vectorX=new int[2];
        vectorX[0]=20;//[0]indice/posicion
        vectorX[1]=8;//[1] indice/posicion
        //vectorX[2]=5;
        System.out.println("Imprimiendo valores del vector");
        System.out.println(vectorX[0]);//imprimiendo valor o elemento del vector vectorX[0]
        //Asignando valores directos a un vector
        int[] vA={12,3,4,5,6,7,8,9,10};
        int[] vB=new int[]{12,2,3,4,5,6,7,8,9,10, 45, 16, 32};
        System.out.println("Tamanho/longitud del vector vA="+vB.length);

    }

        public static void mostrarValores(int[] vector) {
            for (int i = 0; i < vector.length; i++) {
                System.out.println("v["+i+"]= "+vector[i]+" Su indice es: "+i+" Su valor es:"+vector[i]);
            }
        }
        public static int[] rellenarVector(int tv) {
            int[] vector=new int[tv];
            Scanner cs=new Scanner(System.in);
            for (int i = 0; i < vector.length; i++) {
                System.out.print("Ingrese el valor del indice "+i+":");
                vector[i]=cs.nextInt();
                System.out.println("");
            }
            mostrarValores(vector);
            return vector;

        }

    public static void main(String[] args) {
        conceptosVectores();
        System.out.println("Ejercicio 01");
        rellenarVector(10);
    }
    
}
