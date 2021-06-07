package TareaUnidad2;

import java.util.Scanner;

public class tarea5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, n;
        double descuento, horas_trabajadas, sueldo_por_hora, sueldo_semanal;
        String nombre_del_trabajador;
        System.out.print("Ingresa el valor de n: ");
        n = in.nextInt();
        in.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.print("Ingresa el nombre del trabajador: ");
            nombre_del_trabajador = in.nextLine();
            System.out.print("Ingresa el valor de horas trabajadas: ");
            horas_trabajadas = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el valor de sueldo por hora: ");
            sueldo_por_hora = in.nextDouble();
            in.nextLine();
            in.nextLine();
            sueldo_semanal=horas_trabajadas*sueldo_por_hora;
            descuento=0;
            if(sueldo_semanal>0&&sueldo_semanal<=150)
                descuento=sueldo_semanal*0.05;
            if(sueldo_semanal>150&&sueldo_semanal<=300)
                descuento=sueldo_semanal*0.07;
            if(sueldo_semanal>300&&sueldo_semanal<=450)
                descuento=sueldo_semanal*0.09;
            sueldo_semanal=sueldo_semanal-descuento;
            System.out.println("Nombre del trabajador: " + nombre_del_trabajador);
            System.out.println("Valor de descuento: " + descuento);
            System.out.println("Valor de sueldo semanal: " + sueldo_semanal);
            System.out.println();
        }
    }

    
}
