package EjerciciosRelacion1;
//Realizar un programa que solicite 4 números e imprima la media de los
//números. También debe imprimir aquellos números que son superiores a la media.

import java.util.Scanner;

public class EjercicioRelacion5 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu numero1");
        int n1 = sc.nextInt();
        System.out.println("Introduce tu numero2");
        int n2 = sc.nextInt();
        System.out.println("Introduce tu numero3");
        int n3 = sc.nextInt();
        System.out.println("Introduce tu numero4");
        int n4 = sc.nextInt();

        double media = ((n1 + n2 + n3 + n4) / 4.0);

        System.out.println("La media es " + media);

        if (n1 > media){
            System.out.println("numero1 es mayor");
        }if (n2 > media) {
            System.out.println("numero2 es mayor");
        }if (n3 > media) {
            System.out.println("numero3 es mayor");
        }if (n4 > media) {
            System.out.println("numero4 es mayor");
        }
    }
}
