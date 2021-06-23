
public class ffff {
    public static void main(String args[]) {
        int numero=6;
        int sumas=1, menor=2, Mayor=numero;
        while ( menor < Mayor ) {
            Mayor = numero / menor;
            if ( numero % menor == 0 ) 
                sumas += menor;
            if ( Mayor != menor && numero % Mayor == 0 )
                sumas += Mayor;
            
	}
        if (sumas == numero) {
            System.out.println("El numero "+numero+" es un numero perfecto;");
        } else {
            System.out.println("El numero "+numero+" no es un numero perfecto;");
        }
    }
}
