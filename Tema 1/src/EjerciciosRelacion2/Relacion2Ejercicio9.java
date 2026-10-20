
//Realizar un programa que lea un número entero positivo y averigüe si es
//perfecto. Un número es perfecto cuando es igual a la suma de sus divisores
//excepto él mismo. Diseñar el programa de forma que si algún dato es
//incorrecto vuelva a solicitarse.

package EjerciciosRelacion2;

import java.util.Scanner;

public class Relacion2Ejercicio9 {
    public static void main(String[] args) {

        //Teclado
        Scanner sc = new Scanner(System.in);


        //Variables
        int numeroPositivo;
        int sumaDivisores;
        int divisor;

        //Bucle

        do {
            System.out.println("Escribe un numero positivo");
            numeroPositivo = sc.nextInt();

        } while (numeroPositivo < 1);

        sumaDivisores = 0;
        divisor = 1;
        //Es partido de 2 porque desde la mitad no hay divisores.
        while (divisor <= numeroPositivo / 2) {
            //while (divisor < numeroPositivo){ la otra posible solución.
            if (numeroPositivo % divisor == 0) {
                sumaDivisores = sumaDivisores + divisor;
            }
            divisor++;

        }
        if (sumaDivisores == numeroPositivo) {
            System.out.println("Es un numero perfecto");
        }


    }
}
