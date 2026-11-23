package EjerciciosMatrices1;

public class Ejercicio16 {
    static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {3, 2, 1, 4, 5},
                {9, 5, 8, 6, 7},
                {0, 9, 8, 5, 4}
        };

        int[][] matrizRes = casillasAdyacentesPares(matriz);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matrizRes[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] casillasAdyacentesPares(int[][] matriz) {

        int[][] matrizRes = new int[matriz.length][matriz[0].length];
        int contador = 0;

        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[filas].length; columnas++) {

                for (int filassubmatriz = filas - 1; filassubmatriz <= filas + 1; filassubmatriz++) {
                    for (int columnassubmatriz = columnas - 1; columnassubmatriz <= columnas + 1; columnassubmatriz++) {

                        if (filassubmatriz == filas && columnassubmatriz == columnas){
                            continue;
                        }
                        if (filassubmatriz < 0 || columnassubmatriz < 0 || filassubmatriz >= matriz.length || columnassubmatriz >= matriz[filassubmatriz].length){
                            continue;
                        }

                        if (matriz[filassubmatriz][columnassubmatriz] % 2 == 0) {
                            contador++;
                        }
                    }
                }
                matrizRes[filas][columnas] = contador;
                contador = 0;

            }
        }
        return matrizRes;
    }
}

