package pe.edu.upeu.arreglos;

import java.util.Scanner;

public class EjemploMatrices {

   public void conceptosMatrices() {
       //definir una matriz con datos predefinidos
       int [][]maX={
                     {5,6,6},
                     {5,6,2},
                     {5,12,2},
                     {5,6,2}
                    };
        //obtener el tamanho de la fila de la Matriz maX
        System.out.println("Tamanho en la fila de Matriz maX="+maX.length);
        //obtener el tamanho de la columana de la Matriz maX
        System.out.println("Tamanho en la columna de Matriz maX="+maX[0].length);
        //obtener el valor/elemento 12 de la matriz maX
        System.out.println("Mostrar el valor 12 de la Matriz maX="+maX[2][1]);
        //Cambiar el elemento 12 de la matriz maX por 16
        maX[2][1]=16;  
        Scanner sc=new Scanner(System.in);
        /*System.out.println("Ingrese un valor en los indices 2,2");
        maX[2][2]=sc.nextInt();

        System.out.println("Defina el indice para fila:");
        int iFx=sc.nextInt(); 
        int iCx=sc.nextInt(); 
        System.out.println("Ingrese un valor en los indices "+iFx+", "+iCx+":");
        maX[iFx][iCx]=sc.nextInt();     */   

        imprimirMatriz(maX);

        //definir matrices sin dimensiones
        int[][] matrizN;
        //definiendo dimensiones a una matriz
        matrizN=new int[3][3];
        int vi=0;
        //Rellenando una matriz con una serie de numeros
        for (int f = 0; f < matrizN.length; f++) {
            for (int c = 0; c < matrizN[0].length; c++) {
                /*matrizN[f][c]=vi; 
                vi=vi+2;*/
                System.out.println("Ingrese un valor en matrizN["+f+"]["+c+"]:=");
                matrizN[f][c]=sc.nextInt();
                vi=vi+2;
            }
        }
        System.out.println("la nueva matrizN de 3x3");
        imprimirMatriz(matrizN);


    }          
 

   public void imprimirMatriz(int[][] matriz) {
       for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++){
                System.out.print(matriz[f][c]+"\t");
            }
            System.out.println("");
        }
   }
    public static void main(String[] args) {
       EjemploMatrices objEM= new EjemploMatrices();
       objEM.conceptosMatrices();
    }
}
