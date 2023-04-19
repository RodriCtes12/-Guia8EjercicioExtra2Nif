
package guia8ejercicioextra2nif;


public class Guia8EjercicioExtra2Nif {

    
    public static void main(String[] args) {
       Nif nif1 =new Nif();
       Servicio dni1= new Servicio();
       
       
       nif1=dni1.crearNIf();
       dni1.mostrar(nif1);
       dni1.calcularLetra(0);
       dni1.mostrar(nif1);
       
    }
    
}
