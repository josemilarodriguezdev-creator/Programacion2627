//Realizar un programa que solicite 3 números cualesquiera y los muestre por
//pantalla ordenados de menor a mayor.
package EjerciciosRelacion3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n1;
        int n2;
        int n3;
        int numeroMenor;

        System.out.println("Introduce un numero");
         n1 = sc.nextInt();
         n2 = sc.nextInt();
         n3 = sc.nextInt();

         if (n1 > n2){
             numeroMenor = n1;
             n1 = n2;
             n2 = numeroMenor;
         }

         if (n1 > n3){
             numeroMenor = n1;
             n1 = n3;
             n3 = numeroMenor;
         }
         if (n2 > n3){
             numeroMenor = n2;
             n2 = n3;
             n3 = numeroMenor;
         }

        System.out.println("los números ordenados de menor a mayor son :" + n1 + " " + n2 + " " + n3);



//        int num1;
//        int menor = 0;
//        boolean primerNumero = true;
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println("introduce un numero");
//            num1 = sc.nextInt();
//            if (primerNumero){
//                menor = num1;
//            }else{
//                if (menor > num1){
//                    menor = num1;
//                }
//            }
//            if (i == 1){
//                primerNumero = false;
//            }
//
//        }
//        System.out.println(menor);
    }
}
