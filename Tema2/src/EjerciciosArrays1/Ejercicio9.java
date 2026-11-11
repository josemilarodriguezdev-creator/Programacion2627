//
//Modifica el metodo anterior y acepta un parámetro “reverse”, que indique si el array
//debe devolverse ordenado de menor a mayor o al revés

package EjerciciosArrays1;

import Chetos.Cheats;

import java.util.Arrays;

public class Ejercicio9 {
    static void main(String[] args) {
        int[] primerArray = {5, 1, 3, 2, 4};
        boolean reverse = false;
        char sn = Cheats.leerSiONo("Quieres ordenarlo al reves de Menor a Mayor?");
        if (sn =='S'){
            reverse = true;
        }
        int[] resultado = metodoBurbuja(primerArray, reverse);
        for (int i = 0; i < resultado.length; i++) {
            System.out.println(resultado[i]);
        }
    }

    public static int[] metodoBurbuja(int[] arrays, boolean reverse) {
        int t = 0;
        for (int i = 0; i < arrays.length ; i++) {
            for (int j = 0; j < arrays.length-1-i; j++) {
                if (!reverse) {
                    if (arrays[j] > arrays[j+1]) {
                        t = arrays[j];
                        arrays[j] = arrays[j + 1];
                        arrays[j + 1] = t;
                    }
                } else {
                    if (arrays[j] < arrays[j+1]) {
                        t = arrays[j];
                        arrays[j] = arrays[j + 1];
                        arrays[j + 1] = t;
                    }
                }
            }
        }
        return arrays;
    }

}



