
//Realizar un programa que solicite un número entero positivo o cero y
//        calcule su factorial. Diseñar el programa de forma que si algún dato es
//        incorrecto vuelva a solicitarse.

package EjerciciosRelacion2;

import java.util.Scanner;

public class Relacion2Ejercicio10 {
    public static void main(String[] args) {

        //Teclado
        Scanner sc = new Scanner(System.in);

        //variables
        int numeroEntero;


        do {
            System.out.println("Escribe un numero positivo o 0");
            numeroEntero = sc.nextInt();
        } while (numeroEntero < 0);

        int factorial = 1;
        for (int i = 2; i <= numeroEntero; i++) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + numeroEntero + " es " + factorial);


    }
}
