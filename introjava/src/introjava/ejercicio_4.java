/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package introjava;
import java.util.Scanner;
/**
 *
 * @author Mel-Mon
 */
public class ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Equivalente en grados Fahrenheit de grados Centigrados");
        System.out.println("Ingrese los grados centigrados:");
        int gradosF = leer.nextInt();
        int convertidoF = 32 + (9 * (gradosF / 5));
        System.out.println("La equivalencia en grados Fahrenheit es: " + convertidoF);
    }
    
}
