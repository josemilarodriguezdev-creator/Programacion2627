
//Realizar un programa que muestre todas las tablas de multiplicar (del 1 al
//        10).

package EjerciciosRelacion3;

public class Ejercicio9 {
    public static void main(String[] args){


        for (int i = 0; i <=10; i++) {
            System.out.println("Esta es la tabla del " + i);
            for (int j = 0; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " +  j*i );
            }
        }

    }
}
