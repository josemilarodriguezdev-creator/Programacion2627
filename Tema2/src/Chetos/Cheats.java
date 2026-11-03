package Chetos;

import java.util.Locale;
import java.util.Scanner;

public class Cheats {

    //-------Escáner-------
    static Scanner sc = new Scanner(System.in);

    //------Leer un String------
    public static String leerCadena(String mensaje) {

        System.out.print(mensaje + ": ");
        String cadenaIntroducida = sc.nextLine();
        return cadenaIntroducida;
    }

    //-----Leer un entero-----
    public static int leerEntero(String mensaje) {

        System.out.print(mensaje + ": ");
        int numeroIntroducido = Integer.parseInt(sc.nextLine());
        return numeroIntroducido;
    }

    //------Leer un entero positivo-------
    public static int leerEnteroPositivo(String mensaje) {

        int numeroIntroducidoPositivo;

        do {

            System.out.print(mensaje + ": ");
            numeroIntroducidoPositivo = Integer.parseInt(sc.nextLine());
            if (numeroIntroducidoPositivo <= 0) {
                System.out.println("Introduce un numero positivo");
            }

        } while (numeroIntroducidoPositivo <= 0);
        return numeroIntroducidoPositivo;

    }

    //------Leer un decimal-------
    public static double leerDouble(String mensaje) {

        System.out.print(mensaje + ": ");
        double decimalIntroducido = Double.parseDouble(sc.nextLine());
        return decimalIntroducido;
    }

    //-------Leer un numero en un rango-------
    public static int leerEnteroEnRango(String mensaje, int min, int max) {

        System.out.print(mensaje + ": ");
        int numeroEnRango;

        do {
            numeroEnRango = Integer.parseInt(sc.nextLine());
            if (numeroEnRango < min || numeroEnRango > max) {
                System.out.println("Debes introducir un numero entre " + min + " y " + max);
            }
        } while (numeroEnRango < min || numeroEnRango > max);
        return numeroEnRango;
    }

    //-------Leer un carácter-----
    public static char leerCaracter(String mensaje) {

        System.out.print(mensaje + ": ");
        char caracterIntroducido = sc.nextLine().charAt(0);
        return caracterIntroducido;
    }

    //------si o no--------
    public static char leerSiONo(String mensaje) {

        char respuestas;

        do {
            System.out.println(mensaje + " (S/N): ");
            respuestas = sc.nextLine().toUpperCase(Locale.ROOT).charAt(0);
        } while (respuestas != 'S' && respuestas != 'N');
        return respuestas;
    }

    //-------Calcular el area de un circulo---------
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }


}
