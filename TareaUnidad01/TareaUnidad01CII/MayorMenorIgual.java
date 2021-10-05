package TareaUnidad01CII;

import java.util.Scanner;
class MayorMenorIgual{
static Scanner teclado=new Scanner(System.in);
static void ejercicio1(){
//Definir variables y otros
int variable1,variable2;   
//datos de entradas
System.out.println("ingrese la variable a");
variable1=teclado.nextInt();
System.out.println("ingrese la variable b");
variable2=teclado.nextInt();
//proceso jajajajjja
if (variable1>variable2) {
    System.out.println("el numero mayor es:"+variable1 );
}
 else  {
    System.out.println("el numero mayor es:"+variable2 );
 }

 if (variable1<variable2) {
    System.out.println("el numero menor es:"+variable1 );
}
 else  {
    System.out.println("el numero menor es:"+variable2 );
 }
 if(variable1 == variable2){
   System.out.println("Los numeros son iguales");
}else{
   System.out.println("Los numeros NO son iguales");
}

 }
public static void main(String[] arg){ejercicio1();}
}