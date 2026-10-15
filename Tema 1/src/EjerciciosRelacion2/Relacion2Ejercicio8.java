
//Realizar un programa que solicite un conjunto de números. Después de
//introducir cada número se realizará la pregunta: "¿Desea introducir más
//números (S/N)". Si la respuesta es 'S' se solicitará otro número. Cuando no
//desee introducir más números debe informar cual es el menor de los
//números introducidos.


package EjerciciosRelacion2;

import java.util.Scanner;

public class Relacion2Ejercicio8 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int numeros;
        char respuestas;
        int menor = Integer.MAX_VALUE;
//        boolean primerNumero = true;
        do {
            System.out.println("Introduce un numero");
            numeros = sc.nextInt();

            if (menor > numeros){
                menor = numeros;
//                primerNumero = false;
            }
            sc.nextLine();
            do {
                System.out.println("Desea introducir otro numero (S/N)");
                respuestas = sc.nextLine().charAt(0);
            }while (respuestas != 'S' && respuestas != 'N');


        }while (respuestas == 'S');
        System.out.println("El numero menor es " + menor);
    }
}
