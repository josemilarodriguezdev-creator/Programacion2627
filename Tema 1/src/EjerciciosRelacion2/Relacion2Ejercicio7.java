
//Realizar un programa que solicite una cantidad de números que van a
//pedirse por teclado. Una vez que solicite todos ellos debe informar de cual
//es la media de los números. Diseñar el programa de forma que si la
//cantidad es incorrecta vuelva a solicitarse.

        package EjerciciosRelacion2;

import java.util.Scanner;

public class Relacion2Ejercicio7 {
    public static void  main(String[] args){

        Scanner sc = new Scanner(System.in);
        int numeros;
        do {
            System.out.println("Introduce los números que quieras");
            numeros = sc.nextInt();
            if (numeros <= 0){
                System.out.println("Inserta un numero positivo");
            }
        }while (numeros <= 0);
        int suma = 0;
        for (int i = 0; i <numeros ; i++) {
            System.out.println("Introduce numero " + i);
            suma = suma + sc.nextInt();
        }
        System.out.println("La media es " + (double) suma / numeros);
    }
}
