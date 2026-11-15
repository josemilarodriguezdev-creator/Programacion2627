
//Criba de Eratóstenes: este metodo sirve para encontrar los números primos
//existentes sin tener que calcular sus divisores. El metodo es el siguiente:
//a. Comenzamos con el número 2. Tacharemos todos los múltiplos de 2 hasta
//llegar a n (siendo n el número máximo que queremos comprobar).
//b. Seguiremos con el siguiente número que no esté tachado, y repetiremos el
//punto a hasta que lleguemos a n.
//Crea un metodo que encuentre todos los números primos existentes hasta el
//        número n, que introducirá el usuario por teclado. Para ello, usa un array y “tacha” las
//posiciones que no sean primas.


package EjerciciosArrays1;

import Chetos.Cheats;

public class Ejercicio15 {

    public static void criba(int n) {

        boolean[] primos = new boolean[n + 1];

        // Inicializamos todas las posiciones como true
        for (int i = 2; i <= n; i++) {
            primos[i] = true;
        }

        // Buscamos los números primos
        for (int i = 2; i <= n; i++) {

            if (primos[i]) {

                // Tachamos todos sus múltiplos
                for (int j = i * 2; j <= n; j += i) {
                    primos[j] = false;
                }
            }
        }

        // Mostramos los números primos
        System.out.println("Números primos hasta " + n + ":");

        for (int i = 2; i <= n; i++) {
            if (primos[i]) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int n = Cheats.leerEntero("Introduce el número máximo:");

        criba(n);
    }
}



