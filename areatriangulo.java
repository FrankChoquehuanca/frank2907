import java.util.Scanner;
class areatriangulo{
    static  Scanner teclado=new Scanner(System.in);
    
    public static void main(String[] arg){
        System.out.println("area del triangulo");
        int b, h, area;
        System.out.println("Ingrese Base:");
        b=teclado.nextInt();
        System.out.println("Ingrese Altura:");
        h=teclado.nextInt();
        area=(b*h)/2;
        System.out.println("El area es: "+area);
      }
}