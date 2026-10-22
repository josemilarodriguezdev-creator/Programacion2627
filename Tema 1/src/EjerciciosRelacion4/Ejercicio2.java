package EjerciciosRelacion4;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroinvertido = 0;
        int numeros;
        int ultimodig;
        System.out.println("Escribe un numero y te digo si es capicua");
        numeros = sc.nextInt();

        while (numeros > 0) {
            ultimodig = numeros % 10;
            numeroinvertido = numeroinvertido * 10 + ultimodig;
            numeros = numeros / 10;
            if (numeroinvertido == numeros) {
                System.out.println("el numero es capicua");
            }

        }

    }
}
