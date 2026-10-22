package EjerciciosRelacion3;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean esValido = false;
        int numero1;
        int numero2;
        do {
            System.out.println("Introduce un numero mayor a 0");
            numero1 = scanner.nextInt();
            if (numero1 > 0) {
                esValido = true;
            }
        } while (!esValido);

        do {
            esValido = false;
            System.out.println("Introduce un numero mayor a 0");
            numero2 = scanner.nextInt();
            if (numero2 > 0) {
                esValido = true;
            }
        } while (!esValido);

        int resto = numero1 % numero2;
        while (resto != 0){
            numero1 = numero2;
            numero2 = resto;
            resto = numero1 % numero2;
        }
        System.out.printf("El M.C.D es %d",numero2);
    }
}
