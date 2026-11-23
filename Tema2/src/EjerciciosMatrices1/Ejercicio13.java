package EjerciciosMatrices1;


public class Ejercicio13 {

    static void main(String[] args) {

        int[][] matriz1 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {3, 2, 1, 4, 5},
                {9, 5, 8, 6, 7},
                {0, 9, 8, 5, 4}
        };

        int[][] resultado = reflejarMatriz(matriz1);

        System.out.println("Matriz original");

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz reflejada");

        if (resultado != null) {
            for (int i = 0; i < resultado.length; i++) {
                for (int j = 0; j < resultado[i].length; j++) {
                    System.out.print(resultado[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("La matriz no es cuadrada");
        }
    }

    public static boolean matrizCuadrada(int[][] matriz) {

        boolean cuadrada = true;

        for (int filas = 0; filas < matriz.length; filas++) {
            if (matriz.length != matriz[filas].length) {
                cuadrada = false;
                break;
            }
        }

        return cuadrada;
    }

    public static int[][] reflejarMatriz(int[][] matriz) {

        int[][] nuevaMatriz = null;

        if (matrizCuadrada(matriz)) {

            nuevaMatriz = new int[matriz.length][matriz.length];

            for (int filas = 0; filas < matriz.length; filas++) {

                for (int columna = 0; columna < matriz.length; columna++) {

                    nuevaMatriz[filas][columna] =
                            matriz[matriz.length - 1 - columna][matriz.length - 1 - filas];

                }
            }
        }

        return nuevaMatriz;
    }
}



