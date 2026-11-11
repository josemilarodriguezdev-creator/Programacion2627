
//Crea un metodo contieneElemento, que acepte un array de enteros y un entero a
//buscar, que realice la misma operación que el ejercicio anterior, y devuelva un valor
//booleano que indique si el array contiene el elemento o no.

package EjerciciosArrays1;

public class Ejercicio7 {

    public static boolean buscarValorEnArray(int[] array, int numeroABuscar){

        for (int i = 0; i < array.length; i++) {
            if (numeroABuscar == array[i]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){

        int[] arrayPrueba = {14,6,4,5,3,13,78,9,977,44};

        int n1 = 13;

        System.out.println(buscarValorEnArray(arrayPrueba,n1));
    }

}
