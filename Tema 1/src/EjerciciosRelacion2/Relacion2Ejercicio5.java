package EjerciciosRelacion2;
//Realizar un programa que solicite números hasta que se introduzca un
//número negativo. Cuando termine informará de cuantos números positivos
//se han introducido. En este programa el número 0 se considera positivo

import java.util.Scanner;

public class Relacion2Ejercicio5 {
    public void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int contadorpostivos = 0;
        int numeros;
        System.out.println("introduce numeros (un numero negativo para terminar)");

        do {
            System.out.println("numero: ");
            numeros = sc.nextInt();

            if (numeros >= 0){
                contadorpostivos++;
            }
        }while (numeros>=0);

        System.out.println("Hay " + contadorpostivos + " numeros positivos incluyendo el 0");

    }
}
