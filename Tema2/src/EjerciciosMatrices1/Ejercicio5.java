package EjerciciosMatrices1;

public class Ejercicio5 {

    static void main(String[] args) {
        int[][] matriz = {{1, 1, 1, 1, 1}, {3, 3, 3, 3, 3}, {7, 7, 7, 7, 7}};
        imprimirMatriz(matriz);
    }

    public static void imprimirMatriz(int[][] matriz) {

        for (int columna = 0; columna < matriz[0].length; columna++) {

            for (int fila = 0; fila < matriz.length; fila++) {
                System.out.print(matriz[fila][columna] + " ");
            }

        }
    }
}


