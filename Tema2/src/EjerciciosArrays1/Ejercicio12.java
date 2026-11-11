
//crea un metodo que acepte un array de enteros y devuelva el mismo array ordenado
//de menor a mayor. Utiliza para ello el metodo de ordenación de la burbuja.

package EjerciciosArrays1;

import Chetos.Cheats;

import java.util.Arrays;

public class Ejercicio12 {

    static void main(String[] args) {
        arrayOrdenado();
    }

    public static void arrayOrdenado() {

        //Creo el array
        int[] array1 = {4, 3, 7, 8, 1, 2};
        int temporal;
        char sn = Cheats.leerSiONo("Quieres ordenarlo al reves");


        //Vuelve a hacerlo de nuevo hasta llegar al final del array
        for (int j = 0; j < array1.length; j++) {
            //Recorre el array
            for (int i = 0; i < array1.length - 1; i++) {
                temporal = array1[i];
                //Hago el if para comparar la primera casilla con la siguiente
                if (array1[i] < array1[i + 1]) {
                    array1[i] = array1[i + 1];
                    array1[i + 1] = temporal;
                }
                //Creo el otro for para hacer la segunda parte del metodo
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}

