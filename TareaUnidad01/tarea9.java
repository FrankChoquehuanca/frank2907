import java.util.Scanner;
class tarea9 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int antiguedad, bono;
      System.out.println("Ingresa el valor de antiguedad: ");
      antiguedad = in.nextInt();
      in.nextLine();
      bono=antiguedad<=5?antiguedad*100:1000;
      System.out.println("Valor de bono: " + bono);
   }

}