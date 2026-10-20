//Se desea realizar un programa que implemente un juego que consiste en
//acertar un número secreto. El ordenador deberá generar aleatoriamente un
//número secreto entre 1 y 100 y el jugador tratará de acertarlo.
//Cada vez que el jugador introduzca un número, se comprobará si es el
//        número secreto, en cuyo caso termina el juego. Si no lo es, se informará
//que el número introducido es mayor o menor que el número secreto. El
//programa termina cuando acierta el número (gana) o cuando agota el
//número de intentos ( en nuestro caso 5) sin acertar el número , en cuyo
//caso pierde.


package EjerciciosRelacion3;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int miNumero = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Escribe un numero entre el 1-100 para intentar adivinar el numero secreto");
            miNumero = sc.nextInt();
            while (miNumero <= 0 || miNumero > 100) {
                System.out.println("El numero tiene que estar entre 1-100");
            }
            if (miNumero == numeroSecreto) {
                System.out.println("Es el numero!!");
                break;
            } else if (miNumero < numeroSecreto) {
                System.out.println("El numero escrito es menor que el numero secreto");
            } else
                System.out.println("El numero es mayor que el numero secreto");
        }


    }

}

