package EjerciciosRelacion2;
//Realizar un programa que lea un número estrictamente positivo N y
//muestre la suma de los N primeros números. Diseña el programa de forma
//que si N es incorrecto vuelva a solicitarse.


import java.util.Scanner;

public class Relacion2Ejercicio4 {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        int cantidad = 0;
        do {
            System.out.println("Introduce un numero");
            cantidad = sc.nextInt();

            if (cantidad <=0){
                System.out.println("debe de ser mayor que positivo o mayor que 0");
            }
        } while (cantidad <=0);

        int suma = 0;
        for (int n1 = 1; n1 <= cantidad; n1++) {
            suma += n1;
        }
        System.out.println("la suma total es " + suma);
    }
}
