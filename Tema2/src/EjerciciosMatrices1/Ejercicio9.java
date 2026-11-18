package EjerciciosMatrices1;

public class Ejercicio9 {
    static void main(String[] args) {
        int[][] matriz = {{1,2,3},{4,5,6},{4,5,6},{1,2,3}};
        System.out.println(matrizSimetrica(matriz));
    }

    public static boolean matrizSimetrica(int[][] matriz) {
        for (int i = 0; i < matriz.length/2; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != matriz[matriz.length-1-i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
