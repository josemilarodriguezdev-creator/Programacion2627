
//Crea un metodo que reciba dos matrices, y compruebe si son exactamente iguales

package EjerciciosMatrices1;

public class Ejercicio7 {

    /**
     * Recibe dos matrices, y comprueba si son exactamente iguales
     *
     * @param matriz1 la primera matriz
     * @param matriz2 la segunda
     * @return true si las 2 matrices son iguales en tamaño y contenido
     */

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


    /**
     * Requiere que ambas matrices tengan el mismo tamaño si no no funcionara
     * @param matriz1 la matriz 1
     * @param matriz2 la matriz 2
     * @return true si las dos matrices son iguales en valor
     */
    public static boolean comprobarValoresMatrices(int[][] matriz1, int[][] matriz2){

        //Llamamos al metodo anterior para comprobar que las dos matrices tengan el mismo tamaño
        if (!comprobarTamañoMatrices(matriz1,matriz2)){
            return false;
        }

        for (int fila = 0; fila < matriz1.length; fila++) {
            for (int columna = 0; columna < matriz1[fila].length; columna++) {

                if (matriz1[fila][columna] != matriz2[fila][columna]){
                    return false;
                }

            }
        }
        return true;
    }

    static void main(String[] args) {

        int[][] matriz1 = {{1, 1, 1, 1, 1}, {3, 3, 3, 3, 3}, {7, 7, 7, 7, 7}};
        int[][] matriz2 = {{1, 1, 1, 1, 1}, {3, 3, 3, 3, 3}, {7, 7, 7, 7, 7}};


        if (comprobarValoresMatrices(matriz1,matriz2)){
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }

}
