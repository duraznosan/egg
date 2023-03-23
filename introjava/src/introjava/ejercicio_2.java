/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Mel-Mon
 */
public class ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su nombre por teclado:");
        nombre = leer.next();
        System.out.println("Mi nombre es " + nombre + " y este es el segundo ejercicio de la introducción a Java");
    }
    
}
