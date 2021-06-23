package pe.edu.upeu.fdch.examen;

import java.util.Scanner;

import pe.edu.upeu.fdch.utils.LeerTeclado;

public class ResolucionExamen {
    LeerTeclado teclado=new LeerTeclado();
 public  void Impuestoxvehiculo() {
    int categoria , cant1=0,n1=12,n2=8,n3=5,ni1=0,ni2=0,ni3=0;
        do {
            categoria=teclado.leer(0,"¿Que categoria es su auto: 1-2-3 ?");
        switch (categoria) {
            case 1:
                cant1=teclado.leer(0,"Cuantos vehiculos tiene de categoria 1");
                for (int j = 0; j < cant1; j++) {
                System.out.println("Usted debe pagar: "+n1+"% de su valor");
                ni1=ni1+n1;
                }
                System.out.println("Por toda la categoria se pagara"+ni1+"% de su valor");
                break;
            case 2:
                cant1=teclado.leer(0,"Cuantos vehiculos tiene de categoria 2");
                for (int j = 0; j < cant1; j++) {
                System.out.println("Usted debe pagar: "+n2+"% de su valor");
                ni2=ni2+n2;
               }
               System.out.println("Por toda la categoria se pagara"+ni2+"% de su valor");
                break;
            case 3:
                cant1=teclado.leer(0,"Cuantos vehiculos tiene de categoria 3");
                for (int j = 0; j < cant1; j++) {
                System.out.println("Usted debe pagar: "+n3+"% de su valor");
                ni3=ni3+n3;
                }
                System.out.println("Por toda la categoria se pagara"+ni3+"% de su valor");
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
        System.out.println("...........................");
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