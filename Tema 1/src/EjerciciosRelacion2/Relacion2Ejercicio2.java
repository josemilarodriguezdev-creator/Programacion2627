package EjerciciosRelacion2;
//Realizar un programa que lea un número entero entre 0 y 10 y visualice su
//tabla de multiplicar

import java.util.Scanner;

public class Relacion2Ejercicio2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n1= 0;
        do {
            System.out.println("Introduce un numero del 1-10");
             n1 = sc.nextInt();
            if (n1 <0 || n1 >10){
                System.out.println("no es un numero valido");
            }
        }while (n1 <0 || n1 >10);

        for (int n2 = 1; n2 <=10; n2++) {
            System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
        }


    }
}
