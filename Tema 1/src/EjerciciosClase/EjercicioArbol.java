package EjerciciosClase;

import java.util.Scanner;

public class EjercicioArbol {
    public static void main(String[] args){


        int altura;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la altura del árbol");
        altura = sc.nextInt();

        for (int i = 0; i <altura; i++) {

            for (int j = 0; j < altura -i -1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
