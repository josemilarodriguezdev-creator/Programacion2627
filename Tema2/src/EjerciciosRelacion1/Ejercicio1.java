
//1. Crea un programa que sume todas las posiciones pares de un array de enteros.


package EjerciciosRelacion1;

public class Ejercicio1 {

    public static void main(String[] args){

        int[] arrayParaSumar = {3,5,6,7,8,9};
        int resultado = sumaPosicionesPares(arrayParaSumar);
        System.out.println("La suma es: " + resultado);

    }
    public static int sumaPosicionesPares (int[] arrayEntero){
        int suma = 0;
            for (int i = 0; i < arrayEntero.length; i++) {
                if (i % 2 == 0) {
                    suma = suma + arrayEntero[i];
                }

            }

        return suma;
    }
}
