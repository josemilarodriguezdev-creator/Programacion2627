//Crea un metodo que acepte 2 arrays, y devuelva un nuevo array con los elementos
//que ambos arrays tienen en común

package EjerciciosMatrices1;

public class Ejercicio11 {

    static void main(String[] args) {
        int[][] matriz1 = {{1,2,3},{4,5,6}};
        int[][] matriz2 = {{6,5,4},{3,2,1}};

        if (!matricesIguales(matriz1, matriz2)) {
            System.out.println("Las matrices no son inversas");
        }

        if (matrizInversa(matriz1, matriz2)) {
            System.out.println("Las matrices son inversas");
        } else {
            System.out.println("Las matrices no son inversas");
        }
    }

    public static boolean matrizInversa(int[][] matriz1, int[][] matriz2) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                if (matriz1[i][j] != matriz2[matriz2.length-1-i][matriz2[i].length-1-j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean matricesIguales(int[][] matriz1, int[][] matriz2) {
        if (matriz1.length != matriz2.length) {
            return false;
        }

        for (int i = 0; i < matriz1.length; i++) {
            if (matriz1[i].length != matriz2[i].length) {
                return false;
            }
        }

        return true;
    }

}
