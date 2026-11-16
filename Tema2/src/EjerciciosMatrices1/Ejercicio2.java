
//Crea un metodo que sume todas las posiciones de una matriz y devuelva dicho número.


package EjerciciosMatrices1;

public class Ejercicio2 {

    static void main(String[] args) {
        int[][] matriz = {{1, 1, 1, 1, 1}, {3, 3, 3, 3, 3}, {7, 7, 7, 7, 7}};
        sumarMatriz(matriz);
        System.out.println(sumarMatriz(matriz));
    }

    public static int sumarMatriz(int[][] matriz) {

        int suma = 0;

        for (int fila = 0; fila < matriz.length; fila++) {

            for (int columna = 0; columna < matriz[fila].length; columna++) {

                suma += matriz[fila][columna];

            }

        }
        return suma;
    }
}



