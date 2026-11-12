package EjerciciosArrays1;

import Chetos.Cheats;

public class Ejercicio13 {
    static int contador = 0;

    public static void apilar(int[] array) {
        if (contador == 10) {
            System.out.println("La pila está llena, no puedo apilar el elemento");
        } else {
            int num = Cheats.leerEntero("Apilar");
            array[contador++] = num;
        }
    }

    public static void desapilar(int[] array) {
        if (contador == 0) {
            System.out.println("No hay elementos en la pila");
        } else {
            System.out.println("Desapilar:");
            array[contador--] = 0;
        }
    }

    static void main(String[] args) {
        int[] pila = new int[10];
        int opcion;

        opcion = Cheats.leerEnteroEnRango("Elige una opción (1. Apilar / 2. Desapilar / 3. Salir)", 1, 3);
        while (opcion == 1 || opcion == 2) {
            switch (opcion) {
                case 1:
                    apilar(pila);
                    System.out.printf("Pila:");
                    for (int i = 0; i < contador; i++) {
                        System.out.print(" " + pila[i] + " ");
                    }
                    System.out.println();
                    break;
                case 2:
                    desapilar(pila);
                    System.out.printf("Pila:");
                    for (int i = 0; i < contador; i++) {
                        System.out.print(" " + pila[i] + " ");
                    }
                    System.out.println();
                    break;
            }
            opcion = Cheats.leerEnteroEnRango("Elige una opción (1. Apilar / 2. Desapilar / 3. Salir)", 1, 3);
        }
    }
}
