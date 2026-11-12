package EjerciciosArrays1;


import Chetos.Cheats;

public class Ejercicio14 {
    static int contador = 0;

    public static void encolar(int[] array) {
        if (contador == 10) {
            System.out.println("La cola está llena, no puedo encolar el elemento");
        } else {
            int num = Cheats.leerEntero("Encolar");
            array[contador++] = num;
        }
    }

    public static void desencolar(int[] array) {
        if (contador == 0) {
            System.out.println("No hay elementos en la cola");
        } else {
            System.out.println("Desencolar:");
            for (int i = 0; i < contador - 1; i++) {
                array[i] = array[i + 1];
            }
            contador--;
        }
    }

    static void main(String[] args) {
        int[] cola = new int[10];
        int opcion;

        opcion = Cheats.leerEnteroEnRango("Elige una opción (1. Encolar / 2. Desencolar / 3. Salir)", 1, 3);
        while (opcion == 1 || opcion == 2) {
            switch (opcion) {
                case 1:
                    encolar(cola);
                    System.out.printf("Cola:");
                    for (int i = 0; i < contador; i++) {
                        System.out.print(" " + cola[i] + " ");
                    }
                    System.out.println();
                    break;
                case 2:
                    desencolar(cola);
                    System.out.printf("Cola:");
                    for (int i = 0; i < contador; i++) {
                        System.out.print(" " + cola[i] + " ");
                    }
                    System.out.println();
                    break;
            }
            opcion = Cheats.leerEnteroEnRango("Elige una opción (1. Encolar / 2. Desencolar / 3. Salir)", 1, 3);
        }
    }
}


