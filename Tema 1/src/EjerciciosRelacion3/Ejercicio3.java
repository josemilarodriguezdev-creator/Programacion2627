//Realizar un programa que solicite un número entero y determine el número
//de cifras que tiene dicho número.

        package EjerciciosRelacion3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int numeroOriginal;
        int numero;
        int guardarNumeros = 0;

        System.out.println("Introduce un numero y te digo cuantas cifras tiene");
        numeroOriginal = sc.nextInt();

        numero = numeroOriginal;

        while (numero > 0){
            int ultimodig = numero % 10;
            ultimodig = 1;
            guardarNumeros = guardarNumeros + ultimodig;
            numero = numero / 10;


        }
        System.out.println("El numero " + numeroOriginal + " tiene " + guardarNumeros + " cifras");
    }
}
