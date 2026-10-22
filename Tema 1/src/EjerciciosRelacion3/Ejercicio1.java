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

    }
}
