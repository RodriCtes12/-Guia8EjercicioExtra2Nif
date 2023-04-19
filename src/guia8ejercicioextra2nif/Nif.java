
package guia8ejercicioextra2nif;



    public class Nif {

    static char letrasDni(int resto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private long dni;
    private char letra;

    public static final char[] letrasDni = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
        'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public Nif() {
    }

    public Nif(long dni, char letra) {
        this.dni = dni;
        this.letra = calcularletra(dni);
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    private char calcularletra(long dni) {
        int resto = (int) (dni % 23);
        return letrasDni[resto];
    }

    public String mostrar() {
        String dniStr = String.format("%08d", dni);
        return dniStr + "-" + Character.toUpperCase(letra);
    }

    @Override
    public String toString() {
        return "Nif{" + "dni=" + dni + ", letra=" + letra + '}';
    }
    
}
    

