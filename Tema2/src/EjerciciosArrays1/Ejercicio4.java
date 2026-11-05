
//4. Soluciona el siguiente problema del anterior boletín utilizando arrays. Crea un
//programa que cree 6000 números aleatorios de 0 a 100 (usa una constante para fijar
//este número).
//Muestra:
//        ● La media de los números leídos.
//        ● El dígito en el que más números terminan.
//        ● En qué dígitos no ha terminado ningún número.
//        ● Cuántos números terminan en cada uno de los dígitos (0 .. 9).
//        ● Calcula a qué % del total de números creados equivale cada elemento del
//punto anterior.
//        ● Calcula también la suma total de todos los porcentajes calculados y la media
//de porcentajes para los valores contados (es decir, la suma de todos los
//        porcentajes entre 6 (los valores 0, 1, 2, 3, 4 y 5))
//Prueba a cambiar el valor de la constante para crear muchos más números, como
//60.000, y hazlo de nuevo para crear muy pocos, como 20, o 100. ¿Qué ocurre con
//los porcentajes?¿Se repite cada número una cantidad de veces similar? ¿Qué
//diferencia existe entre crear pocos y muchos números?
//Ejemplo de ejecución:
//El nº 0 se ha repetido 1017 veces. Esto equivale a un 16,95%
//El nº 1 se ha repetido 990 veces. Esto equivale a un 16,50%
//El nº 2 se ha repetido 994 veces. Esto equivale a un 16,57%
//El nº 3 se ha repetido 998 veces. Esto equivale a un 16,63%
//El nº 4 se ha repetido 1017 veces. Esto equivale a un 16,95%
//El nº 5 se ha repetido 984 veces. Esto equivale a un 16,40%
//La suma de todos los porcentajes es equivalente al 100.00%. El % medio para cada
//contador es de 16,67%.


package EjerciciosArrays1;

import java.util.Random;

public class Ejercicio4 {

    //Creo la constante
    static final int TOTAL_NUMEROS = 6000;

    public static void main(String[] args) {

        //Creo una forma de crear un número aleatorio
        Random r = new Random();

        //Creo la variable suma
        int suma = 0;

        //Pongo que el array tenga diez posiciones
        int[] terminaciones = new int[10];


        for (int i = 0; i < TOTAL_NUMEROS; i++) {

            int numeroAleatorio = r.nextInt(100);

            suma += numeroAleatorio;

            terminaciones[numeroAleatorio % 10]++;

        }

        int max = -1;
        int posicionMax = 0;
        int posicionMin = 0;
        int min = Integer.MAX_VALUE;

        System.out.println("La media de los números es: " + (double) suma / TOTAL_NUMEROS);

        for (int i = 0; i < terminaciones.length; i++) {
            if (terminaciones[i] > max){
                max = terminaciones[i];
                posicionMax = i;
            }
        }
        for (int i = 0; i < terminaciones.length; i++) {
            if (terminaciones[i] < min){
                min = terminaciones[i];
                posicionMin = i;
            }
        }
        for (int i = 0; i < terminaciones.length; i++) {

            System.out.printf("El nº %d se ha repetido %d veces. Esto equivale a un %f%% %n" ,i, terminaciones[i], (double) terminaciones[i] / TOTAL_NUMEROS * 100);

        }

        System.out.println("El digito que mas se repitio es: " + posicionMax);
        System.out.println("Se repitió: " + max + " veces");

        System.out.println("El digito que menos se repitio es: " + posicionMin);
        System.out.println("Se repitió: " + min + " veces");

    }

}
