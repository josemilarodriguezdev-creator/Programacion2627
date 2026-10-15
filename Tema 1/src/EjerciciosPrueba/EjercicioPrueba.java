package EjerciciosPrueba;

import java.util.Scanner;

//escribe un programa que encuentre el primer divisor de un numero usando un bucle while
public class EjercicioPrueba {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu numero1");
        int n1 = sc.nextInt();

        if (n1 <= 1) {
            System.out.println("Introduce un numero mayor que 1");
        } else {
            int divisor = 2;
            while (n1 % divisor !=0) {
                divisor++;
            }
            System.out.println("el primer divisor de " + n1 + " es " + divisor);
        }


    }
}
