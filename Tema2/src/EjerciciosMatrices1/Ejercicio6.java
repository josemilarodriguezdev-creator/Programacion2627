
//6. Crea un metodo que reciba una matriz e imprima, en una sola línea, los elementos de la
//misma, pero leídos por columna, empezando por los últimos índices:
//        1 3 5 --> La salida es: 7 5 2 3 0 1
//        0 2 7

package EjerciciosMatrices1;

public class Ejercicio6 {
    static void main(String[] args) {
        int[][] matriz = {{1, 1, 1, 1, 1}, {3, 3, 3, 3, 3}, {7, 7, 7, 7, 7}};
        imprimirMatrizAlReves(matriz);
    }

    public static void imprimirMatrizAlReves(int[][] matriz) {

        for (int columna = matriz[0].length-1; columna >=0; columna--) {

            for (int fila = matriz.length -1; fila >=0; fila--) {
                System.out.print(matriz[fila][columna] + " ");
            }
        }
    }
}
