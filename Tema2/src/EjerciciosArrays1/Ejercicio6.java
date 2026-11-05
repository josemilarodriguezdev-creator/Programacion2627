
//Crea un programa que compruebe si un array contiene un determinado valor. Para
//ello, puedes pedir por parámetros el tamaño del array, los elementos y luego el
//elemento a buscar, o puedes generar el array aleatorio y pedir únicamente el
//elemento a buscar.

package EjerciciosArrays1;

import Chetos.Cheats;

public class Ejercicio6 {

    public static void main(String[] args) {

        int numeroEscrito;

        int[] arrayEjercicio6 = {47, 6, 81, 9, 53, 3, 65, 43, 246, 33, 89, 21};

        numeroEscrito = Cheats.leerEntero("Escribe el numero que quieres buscar si esta dentro del array");

        if (buscarValorEnArray(arrayEjercicio6, numeroEscrito)){
            System.out.println("El numero esta en el array");
        }else {
            System.out.println("El numero no esta en el array");
        }


    }

    public static boolean buscarValorEnArray(int[] array, int numeroABuscar){

        for (int i = 0; i < array.length; i++) {
            if (numeroABuscar == array[i]){
                return true;
            }
        }
        return false;
    }

}
