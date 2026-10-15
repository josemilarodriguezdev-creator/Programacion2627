package EjerciciosRelacion2;
//Realizar un programa que solicite una cantidad de números que van a
//introducirse por teclado. Después, para cada uno de ellos que indique si el
//número es par o impar. Si la cantidad de números introducida es 0 o
//negativa volverá a solicitarse el dato.

import java.util.Scanner;

public class Relacion2Ejercicio3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int cantidad = 0;
        int numero;
        do {
            System.out.println("Introduce cuantos números vas a querer revisar");
             cantidad = sc.nextInt();

            if (cantidad <=0){
                System.out.println("debe de ser mayor que positivo o mayor que 0");
            }
        } while (cantidad <=0);

        for (int i = 0; i <cantidad ; i++) {
            System.out.println("Introduce un numero");
            numero = sc.nextInt();
            if (numero % 2 ==0){
                System.out.println("El numero " + numero + " es par");
            }else {
                System.out.println("El numero " + numero + " es inpar");
            }
        }

    }
}
