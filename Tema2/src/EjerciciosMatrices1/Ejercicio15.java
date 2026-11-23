package EjerciciosMatrices1;


public class Ejercicio15 {

    static void main(String[] args) {

        int filas = 6;
        int columnas = 6;

        System.out.println("Casilla [1,5]: " +
                numeroCasilla(filas, columnas, 1, 5));

        System.out.println("Casilla [4,0]: " +
                numeroCasilla(filas, columnas, 4, 0));

    }

    public static int numeroCasilla(int filas, int columnas,
                                    int fila, int columna) {

        int numero;

        numero = (fila * columnas) + columna + 1;

        return numero;
    }
}


