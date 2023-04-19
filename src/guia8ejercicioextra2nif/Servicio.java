
package guia8ejercicioextra2nif;

import static guia8ejercicioextra2nif.Nif.letrasDni;
import java.util.Scanner;



    public class Servicio {

    int resto = 0;
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Nif nif0 = new Nif();

    public void crearNIf() {

        System.out.println("ingrese dni");
        long dni = sc.nextLong();
        nif0.setDni(dni);
        nif0.setLetra(letrasDni[resto]);

    }

    public char calcularLetra(long dni) {
        char x = 0;

        resto = (int) (dni % 23);

       x =  letrasDni[resto]; 

        System.out.println(resto);
        nif0.setLetra(x);
        System.out.println("nif " + nif0.getDni() + "-" + nif0.getLetra());
        return x;

    }

    public void mostrar(Nif nif0) {

        System.out.println(nif0.mostrar());
    }

    
}
    

