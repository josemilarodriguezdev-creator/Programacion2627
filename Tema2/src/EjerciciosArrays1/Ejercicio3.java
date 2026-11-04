//Crea un programa que pregunte cuántos elementos tendremos en un array de
//enteros. Posteriormente se preguntarán tantos números como haya indicado el
//usuario. Posteriormente, mostraremos por pantalla el mayor, el menor y la media. Si
//el número mayor o menor están repetidos, deberá indicarse cuántas veces se repite.
//Por ejemplo:
//Introduzca las posiciones que tendrá el array: 5
//Introduzca el número 1: 4
//Introduzca el número 2: -1
//Introduzca el número 3: 9
//Introduzca el número 4: 5
//Introduzca el número 5: 9
//El mayor número introducido es 9 (se repite 2 veces)
//El menor número introducido es -1
//La media de los números introducidos es: 5.2

package EjerciciosArrays1;

import Chetos.Cheats;

public class Ejercicio3 {

    public static void main(String[] args) {

        int cuantosElementos;


        cuantosElementos = Cheats.leerEntero("Cuantos elementos tiene el array? ");
        int[] miArray = new int[cuantosElementos];
        leerMayorMenorMedia(miArray);

    }

    public static void leerMayorMenorMedia(int[] arrayEnteros) {

        int max = Integer.MIN_VALUE;
        int contadorMax = 0;
        int min = Integer.MAX_VALUE;
        int contadorMin = 0;
        int suma = 0;

        for (int i = 0; i < arrayEnteros.length; i++) {

            arrayEnteros[i] = Cheats.leerEntero("Introduce el numero " + (i + 1));

        }

        for (int i = 0; i < arrayEnteros.length; i++) {

            suma += arrayEnteros[i];

            if (arrayEnteros[i] > max) {

                max = arrayEnteros[i];
                contadorMax = 1;

            } else if (arrayEnteros[i] == max) {

                contadorMax++;

            }

            if (arrayEnteros[i] < min) {

                min = arrayEnteros[i];
                contadorMin = 1;

            } else if (arrayEnteros[i] == min) {

                contadorMin++;

            }

        }

        System.out.print("El mayor numero introducido es " + max);

        if (contadorMax > 1) {

            System.out.println(" (se repite " + contadorMax + " veces)");

        } else {
            System.out.println();
        }

        System.out.print("El menor numero introducido es " + min);

        if (contadorMin > 1) {
            System.out.println(" (se repite " + contadorMin + " veces)");
        } else {
            System.out.println();
        }

        double media = (double) suma / arrayEnteros.length;

        System.out.println("La media de los números introducidos es: " + media);

    }

}