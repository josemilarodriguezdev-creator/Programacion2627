package EjerciciosMatrices1;


public class Ejercicio14 {

    static void main(String[] args) {

        int[][] matriz1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] resultado = matrizTranspuesta(matriz1);

        System.out.println("Matriz original:");

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz transpuesta:");

        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] matrizTranspuesta(int[][] matriz) {

        int[][] nuevaMatriz = new int[matriz[0].length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                nuevaMatriz[j][i] = matriz[i][j];

            }
        }

        return nuevaMatriz;
    }
}

