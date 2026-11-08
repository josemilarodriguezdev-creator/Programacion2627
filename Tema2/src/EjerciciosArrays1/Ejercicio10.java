
//Crea un array que devuelva un nuevo array donde se hayan eliminado los elementos
//duplicados del primero

package EjerciciosArrays1;

public class Ejercicio10 {


    static void main(String[] args) {


        int[] array1 = {1, 1, 3, 4, 5, 5, 5, 6, 3};
        int[] array2 = new int[array1.length];
        int contador = 0;
        boolean repetido;


        for (int i = 0; i < array1.length; i++) {

            repetido = false;

            for (int j = 0; j < contador; j++) {

                if (array1[i] == array2[j]) {

                    repetido = true;

                }

            }
            if (!repetido){
                array2[contador] = array1[i];
                contador++;
            }
        }
        for (int i = 0; i < contador; i++) {

            System.out.println(array2[i]);

        }
    }
}
