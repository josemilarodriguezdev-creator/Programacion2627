
//Crea un método, que acepte un parámetro “tamaño” de tipo entero, que genere un
//        array de “tamaño” posiciones de números aleatorios de 0 a 1000 y lo muestre por
//        pantalla.


package EjerciciosArrays1;

import Chetos.Cheats;

import java.util.Random;

public class Ejercicio5 {

    public static int[] numerosAleatorios (int tamano) {
        int[] array = new int[tamano];
        for (int i = 0; i < tamano; i++) {
            array[i] = (int)(Math.random() * 1000);
        }
        return array;
    }

    static void main(String[] args) {
        int tamano = Cheats.leerEntero("Introduce el tamaño del array");
        int[] miArray = numerosAleatorios(tamano);
        for (int i = 0; i < tamano; i++) {
            System.out.println(miArray[i]);
        }
    }

}








//    public static void main(String[] args){
//
//        generarArray(5);
//
//    }
//
//
//    public static void generarArray(int tamaño) {
//
//        int[] numeros = new int[tamaño];
//
//        for (int i = 0; i < tamaño; i++) {
//
//            numeros[i] = (int) (Math.random()*1000);
//            System.out.println(numeros[i]);
//        }
//
//    }
//