
package EjerciciosArrays1;

import Chetos.Cheats;

public class Ejercicio14 {

    static int contador = 0;
    static int primerElem = 0;

    public static void encolar(int[] array) {
        if (contador == array.length) {
            System.out.println("La cola está llena, no puedo encolar el elemento");
        } else {
            int num = Cheats.leerEntero("Encolar");

            int posicion = (primerElem + contador) % array.length;

            array[posicion] = num;
            contador++;
        }
    }

    public static void desencolar(int[] array) {
        if (contador == 0) {
            System.out.println("No hay elementos en la cola");
        } else {
            System.out.println("Desencolar: " + array[primerElem]);

            primerElem = (primerElem + 1) % array.length;

            contador--;
        }
    }

    public static void main(String[] args) {
        int[] cola = new int[10];
        int opcion;

        opcion = Cheats.leerEnteroEnRango(
                "Elige una opción (1. Encolar / 2. Desencolar / 3. Salir)", 1, 3);

        while (opcion == 1 || opcion == 2) {

            switch (opcion) {
                case 1:
                    encolar(cola);
                    break;

                case 2:
                    desencolar(cola);
                    break;
            }

            System.out.print("Cola: ");

            for (int i = 0; i < contador; i++) {
                int posicion = (primerElem + i) % cola.length;
                System.out.print(cola[posicion] + " ");
            }

            System.out.println();

            opcion = Cheats.leerEnteroEnRango(
                    "Elige una opción (1. Encolar / 2. Desencolar / 3. Salir)", 1, 3);
        }
    }
}



