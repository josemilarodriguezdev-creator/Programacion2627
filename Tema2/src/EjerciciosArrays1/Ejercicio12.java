
//crea un método que acepte un array de enteros y devuelva el mismo array ordenado
//de menor a mayor. Utiliza para ello el método de ordenación de la burbuja.

package EjerciciosArrays1;

import java.util.Arrays;

public class Ejercicio12 {

    static void main(String[] args) {
        arrayOrdenado();
    }

    public static void arrayOrdenado(){

        //Creo el array
        int[] array1 = {4, 3, 7, 8, 1, 2};
        int temporal;

        //Recorre el array
        for (int i = 0; i < array1.length-1; i++) {
            temporal = array1[i];
            //Hago el if para comparar la primera casilla con la siguiente
            if (array1[i] > array1[i+1]){
                array1[i] = array1[i+1];
                array1[i+1] = temporal;
            }
        }


        System.out.println(Arrays.toString(array1));

    }
}

