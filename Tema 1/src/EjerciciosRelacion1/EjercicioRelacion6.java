package EjerciciosRelacion1;
//Realizar un programa que solicite un carácter por teclado e informe por
//pantalla si el carácter es una vocal o no lo es. Si es una vocal mostrará el
//mensaje “Es la primera vocal (A)” o “Es la segunda vocal (E)”, etc.


import java.util.Locale;
import java.util.Scanner;

public class EjercicioRelacion6 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu letra");
        char letra = sc.next().toUpperCase(Locale.ROOT).charAt(0);

        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){

        }else {
            System.out.println("Es una consonante");
        }

    }
}
