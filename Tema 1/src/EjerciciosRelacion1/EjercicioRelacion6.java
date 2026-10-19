package EjerciciosRelacion1;
//Realizar un programa que solicite un carácter por teclado e informe por
//pantalla si el carácter es una vocal o no lo es. Si es una vocal mostrará el
//mensaje “Es la primera vocal (A)” o “Es la segunda vocal (E)”, etc.


import java.util.Locale;
import java.util.Scanner;

public class EjercicioRelacion6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un caracter");
        char caracter = sc.next().charAt(0);
        //Creo un scanner y leo un char
        switch (caracter) {
            case 'A':
                System.out.println("Es la primera vocal A");
                break;
            case 'E':
                System.out.println("Es la segunda vocal E");
                break;
            case 'I':
                System.out.println("Es la tercera vocal I");
                break;
            case 'O':
                System.out.println("Es la cuarta vocal O");
                break;
            case 'U':
                System.out.println("Es la quinta vocal U");
                break;
        }
        //Creo un caso para cada vocal como me pide el ejercicio y doy la respuesta

    }
}
