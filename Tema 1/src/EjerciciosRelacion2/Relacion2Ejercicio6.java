package EjerciciosRelacion2;

//Realizar un programa que lea dos números enteros cualesquiera numeroA y numeroB,
//y calcule el producto los números mediante sumas, es decir,
//sin usar el operador *

import java.util.Scanner;

public class Relacion2Ejercicio6 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 1 numero");
        int numero1 = sc.nextInt();
        System.out.println("Introduce el 2 numero");
        int numero2 = sc.nextInt();

        int resultado = 0;

        for (int i = 0; i < numero2; i++){
            resultado +=numero1;
        }
        System.out.println("El resultado es " + resultado);
    }
}
