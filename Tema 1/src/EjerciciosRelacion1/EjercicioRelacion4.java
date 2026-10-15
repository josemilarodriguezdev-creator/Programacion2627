package EjerciciosRelacion1;
//Realizar un programa que lea la edad de una persona menor a 100 años e
//informe de si es un niño (0-12 años), un adolescente (13-17), un joven (18-29) o un adulto.

import java.util.Scanner;

public class EjercicioRelacion4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int numero = sc.nextInt();

        if ( numero >= 0 && numero <= 100){

            if (numero >= 0 && numero <= 12){
                System.out.println("Eres un niño");
            } else if (numero > 11 && numero <= 17) {
                System.out.println("Eres un adolescente");
            } else if (numero > 17 && numero <= 29) {
                System.out.println("Eres un joven");
            }else{
                System.out.println("Eres un adulto");
            }

        }
    }
}
