
//Crea un metodo que compruebe si en una matriz hay algún valor negativo, y devuelva un
//valor booleano.


package EjerciciosMatrices1;

public class Ejercicio1 {

    static void main(String[] args) {
        int[][] matriz = {{1, 1, 2, 1, 1}, {3, 3, 4, 3, 3}, {7, 7, 7, 7, 7}};
        if (comprobarMatrizNegativos(matriz)){
            System.out.println("hay negativos");
        }else{
            System.out.println("No hay negativos");
        }

    }

    public static boolean comprobarMatrizNegativos (int[][] matriz){

        boolean negativo = false;

        for (int fila = 0; fila < matriz.length; fila++) {

            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (matriz[fila][columna] < 0){
                    negativo = true;

                }

            }

        }
        return negativo;
    }

}
