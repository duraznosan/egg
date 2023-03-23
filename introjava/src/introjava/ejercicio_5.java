/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
package introjava;
import java.util.Scanner;
/**
 *
 * @author Mel-Mon
 */
public class ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número entero:");
        int number = leer.nextInt();
        System.out.println("El doble de " + number + " es: " + (number * 2));
        System.out.println("El triple de " + number + " es: " + (number * 3));
        int raizCua = (int)Math.sqrt(number);
        System.out.println("La raiz cuadrada de " + number + " es: " + raizCua);
    }
    
}
