package pe.edu.upeu.fdch.examen;

import java.util.Scanner;

import pe.edu.upeu.fdch.utils.LeerTeclado;

public class ResolucionExamen {
    LeerTeclado teclado=new LeerTeclado();
 public  void Impuestoxvehiculo() {
    int categoria , cant1=0,imp1=12,imp2=8,imp3=5,impt1=0,impt2=0,impt3=0;
        do {
            categoria=teclado.leer(0,"¿Que categoria es su auto: 1-2-3 ?");
        switch (categoria) {
            case 1:
                cant1=teclado.leer(0,"Cuantos vehiculos tiene de categoria 1");
                for (int j = 0; j < cant1; j++) {
                System.out.println("Usted debe pagar: "+imp1+"% de su valor");
                impt1=impt1+imp1;
                }
                System.out.println("Por toda la categoria se pagara"+impt1+"% de su valor");
                break;
            case 2:
                cant1=teclado.leer(0,"Cuantos vehiculos tiene de categoria 2");
                for (int j = 0; j < cant1; j++) {
                System.out.println("Usted debe pagar: "+imp2+"% de su valor");
                impt2=impt2+imp2;
               }
               System.out.println("Por toda la categoria se pagara"+impt2+"% de su valor");
                break;
            case 3:
                cant1=teclado.leer(0,"Cuantos vehiculos tiene de categoria 3");
                for (int j = 0; j < cant1; j++) {
                System.out.println("Usted debe pagar: "+imp3+"% de su valor");
                impt3=impt3+imp3;
                }
                System.out.println("Por toda la categoria se pagara"+impt3+"% de su valor");
                break;
           }
      }
        while (categoria ==3);

}
    
    //3.
    public  void TabladeMultiplicar() {
        int nnn=1;
        
        for (int f = 0; f <20; f++) {
        for (int s = 1; s <=10; s++) {
            System.out.println(nnn+"x"+s+"="+(s*nnn));
        }
        nnn=nnn+1;
        System.out.println("..............................");
        }
    }

    //4.
    public  void NumeroPerfecto(Scanner scanner) {
        
        int i, suma = 0, n;
        System.out.println("Introduce un número: ");
        n = scanner.nextInt();
        for (i = 1; i < n; i++) {  
            if (n % i == 0) {
                suma = suma + i;  
            }
        }
        if (suma == n) {                           
            System.out.println("El numero "+n+" Perfecto");
        } else {
            System.out.println("El numero "+n+" No es perfecto");

        }
} 
        
    
     //5.

    public void PotenciaRecursiva() {
     int base,exponente;
     base=teclado.leer(0,"Ingrese el munero de la base ");
     exponente=teclado.leer(0,"Ingrese el numero del exponente ");
     System.out.println(base+"^"+exponente+"="+recursividad(base,exponente));
        }
    public double recursividad(int base,int exponente) {
        if (exponente==0) {
        return 1;
         }
        else{
        return base*recursividad(base,exponente-1);
         }
    }
}