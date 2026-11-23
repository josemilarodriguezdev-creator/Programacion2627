
//Crea un metodo que transforme una matriz CUADRADA (tienes que realizar dicha
//        comprobación) que recibe por parámetro, en otra, que debe ser su reflejo en diagonal (de
//arriba a la izquierda a abajo a la derecha):
//        1 2 3 4 5 1 6 3 9 0
//        6 7 8 9 0 2 7 2 5 9
//        3 2 1 4 5 --> 3 8 1 8 8
//        9 5 8 6 7 4 9 4 6 5
//        0 9 8 5 4 5 0 5 7 4


package EjerciciosMatrices1;

public class Ejercicio12 {

    static void main(String[] args) {

        int[][] matriz1 = {{1,2,3},{4,5,6},{7,8,9}};

        int[][] resultado = reflejarMatriz(matriz1);

        System.out.println("Matriz original");

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz reflejada");

        for (int i = 0; i < resultado.length; i++) {

            for (int j = 0; j < resultado[i].length; j++) {

                System.out.print(resultado[i][j] + " ");

            }

            System.out.println();
        }

    }

    public static boolean matrizCuadrada (int [][] matriz){
        boolean cuadrada = true;

        for (int filas = 0; filas < matriz.length; filas++) {
                if (matriz.length == matriz[filas].length){
                }else {
                    cuadrada = false;
                    break;
                }
        }
        return cuadrada;
    }

    public static int[][] reflejarMatriz (int[][] matriz) {

        int[][] nuevaMatriz = null;
        if (matrizCuadrada(matriz)) {

            nuevaMatriz = new int[matriz.length][matriz.length];

            for (int filas = 0; filas < matriz.length; filas++) {
                for (int columna = 0; columna < matriz.length; columna++) {

                    nuevaMatriz [filas][columna] = matriz [columna][filas];

                }
            }
        }

        return nuevaMatriz;
    }
}
