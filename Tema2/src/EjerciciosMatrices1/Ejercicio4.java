
//4. Crea un metodo que reciba una matriz e imprima, en una sola línea, los elementos de la
//misma, leídos por filas, empezando por los últimos índices:
//        1 3 5 --> La salida es: 7 2 0 5 3 1
//        0 2 7


package EjerciciosMatrices1;

public class Ejercicio4 {

    static void main(String[] args) {
        int[][] matriz = {{1, 1, 1, 1, 1}, {3, 3, 3, 3, 3}, {7, 7, 7, 7, 7}};
        imprimirMatrizAlReves(matriz);
    }

    public static void imprimirMatrizAlReves(int[][] matriz) {

        for (int fila = matriz.length-1; fila >=0; fila--) {

            for (int columna = matriz[fila].length -1; columna >=0; columna--) {
                System.out.print(matriz[fila][columna] + " ");
            }

        }
    }
}


