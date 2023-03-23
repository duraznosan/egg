/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Mel-Mon
 */
public class suma_2_enteros {
    public static void main(String[] arg) {
        Scanner leer = new Scanner(System.in);
        int number1, number2;
        System.out.println("Ingrese el primer número entero:");
        number1 = leer.nextInt();
        System.out.println("Ingrese el segundo número entero:");
        number2 = leer.nextInt();
        System.out.println("la suma de los números ingresados es: " + (number1 + number2));
        
    }
    
}
