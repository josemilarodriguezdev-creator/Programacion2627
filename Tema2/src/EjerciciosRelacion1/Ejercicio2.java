
//Crea un programa que detecte cuántos números negativos hay en un array de
//        enteros

package EjerciciosRelacion1;

public class Ejercicio2 {
    public static void main(String[] args){

        int[] arrayNega = { -2, -5, 4, 8};

        int cuenta = contarNegativos(arrayNega);
        System.out.printf("La cantidad es: %d", cuenta);

    }
    public static int contarNegativos (int[] array) {
        int cuenta = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                cuenta += 1;
            }
        }
        return cuenta;
    }
}
