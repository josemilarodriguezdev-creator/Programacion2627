package EjerciciosRelacion1;

import java.util.Scanner;

public class EjercicioRelacion3 {

//    Realizar un programa que lea un número por teclado. El programa debe
//    imprimir en pantalla un mensaje con “El número xx es múltiplo de 2” o un
//    mensaje con “El número xx es múltiplo de 3”. Si es múltiplo de 2 y de 3
//    deben aparecer los dos mensajes. Si no es múltiplo de ninguno de los dos
//    el programa finaliza sin mostrar ningún mensaje.


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero entero");
        int numero = sc.nextInt();

        if (numero % 3 == 0) {
            System.out.println("El numero es multiplo de 3");
        } else if (numero % 2 == 0) {
            System.out.println("El numero es multiplo de 2");
        }

    }
}
