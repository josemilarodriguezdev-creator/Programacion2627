//Crea un metodo que acepte 2 arrays, y devuelva un nuevo array con los elementos
//que ambos arrays tienen en común


package EjerciciosArrays1;


public class Ejercicio11 {
    public static int[] elementosComunes(int[] array1, int[] array2) {
        int[] arrayAux = new int[array1.length];
        int posicion = 0;
        boolean repe;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    repe = false;
                    for (int k = 0; k < posicion; k++) {
                        if (arrayAux[k] == array1[i]) {
                            repe = true;
                        }
                    }
                    if (!repe) {
                        arrayAux[posicion++] = array1[i];
                    }
                }
            }
        }

        int[] arrayFinal = new int[posicion];
        for (int i = 0; i < posicion; i++) {
            arrayFinal[i] = arrayAux[i];
        }

        return arrayFinal;
    }

    static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 7, 0};
        int[] array2 = {4, 2, 4, -2, 7, 0, 4, 67, 45};
        int[] arrayFinal;

        arrayFinal = elementosComunes(array1, array2);

        for (int i = 0; i < arrayFinal.length; i++) {
            System.out.println(arrayFinal[i]);
        }
    }
}
