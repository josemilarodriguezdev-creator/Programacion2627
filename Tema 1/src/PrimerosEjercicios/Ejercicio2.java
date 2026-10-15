package PrimerosEjercicios;

import java.util.Scanner;

//Introduce dos números enteros y muestra un mensaje que muestre
// la suma, resta, division y multiplicación de las siguientes operaciones

public class Ejercicio2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero entero1");
        double numero1 = Double.parseDouble(sc.nextLine());
        System.out.println("Introduce el numero entero2");
        double numero2 = Double.parseDouble(sc.nextLine());

        System.out.printf("la suma es %.2f, la resta vale %.2f, la multiplicacion es %.2f, la division es %.2f%n",numero1+numero2,numero1-numero2,numero1*numero2,numero1/numero2);
        System.out.println("la suma es " + (numero1 + numero2));
        System.out.println("la resta es " + (numero1 - numero2));
        System.out.println("la multiplicación es " + (numero1 * numero2));
        System.out.println("la division es " + (numero1 / numero2));


    }
}
