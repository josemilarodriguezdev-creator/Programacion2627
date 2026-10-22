//Realiza un programa que pregunte al usuario la hora actual (hora, minutos y
//segundos), y luego pregunte otra hora que deberá sumar a la primera, teniendo en
//cuenta el cambio de día.
//Los siguientes son salidas esperadas para las entradas:
//Introduce la hora base: 13
//Introduce los minutos base: 27
//Introduce los segundos base: 10
//        ¿Cuántas horas quieres sumar?: 1
//        ¿Cuántos minutos quieres sumar?: 0
//        ¿Cuántos segundos quieres sumar?: 55
//La hora resultante es: 14:28:05
//Introduce la hora base: 19
//Introduce los minutos base: 0
//Introduce los segundos base: 0
//        ¿Cuántas horas quieres sumar?: 5
//        ¿Cuántos minutos quieres sumar?: 0
//        ¿Cuántos segundos quieres sumar?: 0
//La hora resultante es: 00:00:00 (del día siguiente)

package EjerciciosRelacion4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int horaBase;
        int minutosBase;
        int segundosBase;
        int sumaHora;
        int sumaMinuto;
        int sumaSegundos;




        do {
            System.out.println("Introduce los segundos base");
            segundosBase = sc.nextInt();
            if (segundosBase < 0 || segundosBase  > 60){
                System.out.println("Introduce los segundos comprendidos entre 00-60");
            }

        } while (segundosBase < 0 || segundosBase > 60);


        do {
            System.out.println("Introduce los minutos base");
            minutosBase = sc.nextInt();
            if (minutosBase < 00 || minutosBase  > 60){
                System.out.println("Introduce los minutos comprendidos entre 00-60");
            }

        }while (minutosBase < 00 || minutosBase > 60);

        do {
            System.out.println("Introduce la hora base");
            horaBase = sc.nextInt();
            if (horaBase < 00 || horaBase  > 24){
                System.out.println("Introduce las comprendidas entre 00-24");
            }

        }while (horaBase < 00 || horaBase > 24);

        System.out.println("Cuantas horas quieres sumas?");
        sumaHora = sc.nextInt();
        System.out.println("Cuantas minutos quieres sumas?");
        sumaMinuto = sc.nextInt();
        System.out.println("Cuantas segundos quieres sumas?");
        sumaSegundos = sc.nextInt();

        int horaFinal;
        int minutoFinal;
        int segundoFinal;


        segundoFinal = (segundosBase + sumaSegundos) % 60;
        int acarreoMinutos = (segundosBase + sumaSegundos) / 60;

        minutoFinal = (minutosBase + sumaMinuto + acarreoMinutos) % 60;
        int acarreoHoras = (minutosBase + sumaMinuto + acarreoMinutos) / 60;

        horaFinal = (horaBase + sumaHora + acarreoHoras) % 24;
        int acarreoDias = (horaBase + sumaHora + acarreoHoras) / 24;


        System.out.printf("la hora resultante es %02d:%02d:%02d ", horaFinal, minutoFinal,segundoFinal);
        if (acarreoDias > 0){
            System.out.printf("+ %d dias despues", acarreoDias);
        }
    }
}
