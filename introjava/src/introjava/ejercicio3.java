/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.
 */
package introjava;

import java.util.Scanner;
/**
 *
 * @author Mel-Mon
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase:");
        frase = leer.next();
        System.out.println("La frase en mayúsculas es: " + frase.toUpperCase());
        System.out.println("La frase en minúsculas es: " + frase.toLowerCase());
        
    }
    
}
