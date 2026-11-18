//
//Crea un metodo que reciba dos matrices, que deben ser de igual tamaño, y sume el
//contenido de las posiciones en una tercera matriz, que será la que devuelva:


package EjerciciosMatrices1;

public class Ejercicio8 {
    public static boolean comprobarTamañoMatrices(int[][] matriz1, int[][] matriz2) {


        if (matriz1.length != matriz2.length) {
            return false;
        }

        for (int fila = 0; fila < matriz1.length; fila++) {
            if (matriz1[fila].length != matriz2[fila].length){
                return false;
            }
        }
        return true;
    }

    public static int [][] sumaMatriz(int[][] matriz1,int [][]matriz2) {

        int [][] matrizResultado = new int [matriz1.length][matriz1[dondeColumnaMayor(matriz1)].length];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return matrizResultado;
    }

    public static int dondeColumnaMayor(int[][] matriz){

        int columnas = 0;
        int columnasAnterior = 0;
        int columnaMayor =0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                columnas++;
            }
            if (columnasAnterior < columnas){
                columnaMayor = i;
                columnasAnterior = columnas;
            }
            columnas = 0;
        }

        return columnaMayor;
    }

    static void main(String[] args) {
        int [][] matriz1 = {{4,6,7},{-7,8,5,5,4,4,8,5},{0,1,3}};
        int [][] matriz2 = {{8,4,1},{2,5,3,2,6,4,67,2},{-8,9,0}};
        int [][] matrizRes;

        if(comprobarTamañoMatrices(matriz1,matriz2)) {

            matrizRes = sumaMatriz(matriz1,matriz2);

            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1[i].length; j++) {

                    System.out.print(matrizRes[i][j] + " ");
                }
            }
        }
    }
}
