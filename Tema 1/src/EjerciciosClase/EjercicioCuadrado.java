package EjerciciosClase;

import java.util.Scanner;

public class EjercicioCuadrado {
    public static void main(String[] args){


        int altura;
        int anchura;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la altura del cuadrado");
        altura = sc.nextInt();
        System.out.println("Dime la anchura");
        anchura = sc.nextInt();

        for (int i = 0; i <altura; i++) {

            for (int j = 0; j < anchura ; j++) {
                if (i == 0 || i == altura -1 || j == 0 || j == anchura -1){
                    System.out.print("*  ");
                }else {
                    System.out.print("   ");
                }

            }
            System.out.println(" ");

        }

    }
}
