import pe.edu.upeu.SubProgramas;
import pe.edu.upeu.recur.EjemplosRecursivos;
import pe.edu.upeu.util.TecladoRead;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        SubProgramas objSP=new SubProgramas();
        EjemplosRecursivos objER=new EjemplosRecursivos();
        TecladoRead tr=new TecladoRead();
        //objSP.calcularFuncionExponecial();
        int numero=tr.read(0, "Indroducir un numero:");
        /*System.out.println("Factorial: "+objSP.factorialLong(numero));
        System.out.println("Factorial: "+objSP.factorialBig(numero));*/ 
   
        System.out.println("Fibonaci iterativo: "+objER.fibonaci(numero)); 
        System.out.println("Fibonaci recursivo: "+objER.fibonaciRecur(numero)); 
    }
}
