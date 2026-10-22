package examen;

import java.util.Scanner;

public class Examen1 {
//    import java.util.Scanner;

//me pudo la presion :(

    public class main {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String nombreDelPiloto;
            int numeroDeVueltas;
            double tiempoObjetivo;
            double tiempoEmpleado;
            double tanda;

            System.out.println("Como se llama el piloto?");
            nombreDelPiloto = sc.next();

            do {
                System.out.println("Cuantas vueltas va a realizar");
                numeroDeVueltas = sc.nextInt();
            } while (numeroDeVueltas <= 2 || numeroDeVueltas >= 11);

            do {
                System.out.println("Cual es el tiempo objetivo en segundos");
                tiempoObjetivo = sc.nextDouble();

            } while (tiempoObjetivo < 0);

            do {

                System.out.println("Cual ha sido el tiempo empleado");
                tiempoEmpleado = sc.nextDouble();

            } while (tiempoEmpleado < 0);

            if (tiempoEmpleado < tiempoObjetivo) ;
            {
                System.out.println("Objetivo Mejorado");
            }
            if (tiempoEmpleado == tiempoObjetivo) {
                System.out.println("Objetivo igualado");
            }
            if (tiempoEmpleado > tiempoObjetivo) {
                System.out.println("Por encima del objetivo");
            }

            System.out.println("---Nombre Del Piloto---");
            System.out.println(nombreDelPiloto);
            System.out.println("Tiempo total de la tanda");
//        System.out.println(tanda);

        }
    }
}