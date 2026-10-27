package MiEntradaSalida;

import java.util.Scanner;

public class MiEntradaSalida {

    public static String leerCadena(String mensaje){
        Scanner sc= new Scanner(System.in);
        System.out.print(mensaje + ": ");
        String cadenaIntroducida = sc.nextLine();
        return cadenaIntroducida;
    }

    public static int LeerEntero(String mensaje){
        Scanner sc= new Scanner(System.in);
        System.out.print(mensaje + ": ");
        int numeroIntroducido = Integer.parseInt(sc.nextLine());
        return numeroIntroducido;
    }

    public static int LeerEnteroPositivo(String mensaje){
        Scanner sc= new Scanner(System.in);
        int numeroIntroducidoPositivo;
        do {

            System.out.print(mensaje + ": ");
            numeroIntroducidoPositivo = Integer.parseInt(sc.nextLine());
            if (numeroIntroducidoPositivo <= 0){
                System.out.println("Introduce un numero positivo");
            }

        }while (numeroIntroducidoPositivo <= 0);
        return numeroIntroducidoPositivo;

    }


}
