//Realizar un programa que, dado un número introducido por el usuario, calcule su
//        número a la inversa. Es decir, dada la entrada: 123456, el programa debe devolver
//        654321. Para este programa, no se deben utilizar métodos de la clase String,
//        Integer, o arrays; solo deben utilizarse operaciones matemáticas. Ten en cuenta solo
//        valores positivos.


        package EjerciciosRelacion4;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int numeroinvertido=0;
        int numeros;
        System.out.println("Escribe un numero que le doy la vuelta");
        numeros = sc.nextInt();

        while (numeros > 0){
           int ultimodig = numeros % 10;
           numeroinvertido = numeroinvertido * 10 + ultimodig;
           numeros = numeros /10;
        }
        System.out.println("El numero invertido es " + numeroinvertido);

    }
}
