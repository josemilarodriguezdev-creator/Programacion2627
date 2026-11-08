
//Crea un método que devuelva la posición que ocupa un valor dentro de un array, o
//-1 si el array no contiene ese valor.


package EjerciciosArrays1;

public class Ejercicio8 {

    public static int buscarValorEnArray(int[] array, int numeroABuscar) {

        for (int i = 0; i < array.length; i++) {
            if (numeroABuscar == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){

        int[] arrayPrueba = {14,6,4,5,3,13,78,9,977,44};

        int n1 = 13;

        System.out.println(buscarValorEnArray(arrayPrueba,n1));
    }

}
