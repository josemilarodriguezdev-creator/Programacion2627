package EjerciciosMatrices1;
//Crea un metodo que reciba una matriz e imprima, en una sola línea, los elementos de la
//misma, leídos por filas:


public class Ejercicio3 {

    static void main(String[] args) {
        int[][] matriz = {{1, 1, 1, 1, 1}, {3, 3, 3, 3, 3}, {7, 7, 7, 7, 7}};
        imprimirMatriz(matriz);
    }

    public static void imprimirMatriz(int[][] matriz) {

        for (int fila = 0; fila < matriz.length; fila++) {

            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }

        }
    }
}