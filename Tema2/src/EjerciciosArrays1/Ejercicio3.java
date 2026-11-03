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
        int [] array = new int[cuantosElementos];
        leerMayorMenorMedia(array);

    }

    public static void leerMayorMenorMedia(int[] arrayEnteros){

        int max = Integer.MIN_VALUE;
        int contadorMax;
        int min = Integer.MAX_VALUE;
        int contadorMin;

        for (int i = 0; i < arrayEnteros.length; i++) {
            arrayEnteros[i] = Cheats.leerEntero("Introduce el numero " + (i+1));
        }

        for (int i = 0; i < ; i++) {
            
        }
        
    }

}