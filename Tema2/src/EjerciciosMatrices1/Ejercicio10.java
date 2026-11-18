package EjerciciosMatrices1;

public class Ejercicio10 {
    static void main(String[] args) {
        int[][] matriz = {{1,2,3},{4,5,6},{4,5,6},{1,2,3}};
        System.out.println(matrizSimetrica(matriz));
    }

    public static boolean matrizSimetrica(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length/2; j++) {
                if (matriz[i][j] != matriz[i][matriz[i].length-1-j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
