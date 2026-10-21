//Realizar un programa que solicite dos números enteros mayores que 0, que
//        calcule el máximo común divisor entre ellos mediante el algoritmo de
//        Euclides y que muestre por pantalla el resultado.
//        El algoritmo de Euclides se explica a continuación con un ejemplo:

package EjerciciosRelacion3;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int resto;

        System.out.println("Dame el primer numero para calcular el mcd");
        num1 = sc.nextInt();
        System.out.println("Dame el segundo numero para calcular el mcd");
        num2 = sc.nextInt();

        do {
            resto = num1 % num2;
            resto = num2 % resto;

        }while (resto == 0);

        System.out.println("El mcd de " + num1 + " y " + num2 + " es " + resto);

    }
}
