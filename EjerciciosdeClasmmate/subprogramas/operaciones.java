package subprogramas;
public class operaciones {

    public int suma(int a, int b) {
        int suma=a+b;
        return suma;
    }
    public int resta(int a, int b) {
        int resta=a-b;
        return resta;
    }
    public int multiplicacion(int a, int b) {
        int multiplicacion=a*b;
        return multiplicacion;
    }
    public int division(int a, int b) {
        int division=a/b;
        return division;
    }
    public int operaciones(int suma,int resta,int multiplicacion,int division) {
        System.out.println("La suma es:"+suma);
        System.out.println("La resta es:"+resta);
        System.out.println("La multiplicacion es:"+multiplicacion);
        System.out.println("La division es:"+division);
        return suma+resta+multiplicacion+division;
    }
    

}
