package EjerciciosRelacion4;

import java.util.Scanner;

public class Ejercicio3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroDecimal = 0;

        System.out.println("Introduce un numero romano");
        String numeroRomano = sc.nextLine();

        for (int i = 0; i < numeroRomano.length(); i++) {
            switch (numeroRomano.charAt(i)) {
                case 'M':
                    numeroDecimal += 1000;
                    break;
                case 'D':
                    if (i + 1 < numeroRomano.length() && numeroRomano.charAt(i + 1) == 'M') {
                        numeroDecimal -= 500;
                    } else {
                        numeroDecimal += 500;
                    }
                    break;
                case 'C':
                    if (i + 1 < numeroRomano.length() && (numeroRomano.charAt(i + 1) == 'M' || numeroRomano.charAt(i + 1) == 'D')) {
                        numeroDecimal -= 100;
                    } else {
                        numeroDecimal += 100;
                    }
                    break;
                case 'L':
                    if (i + 1 < numeroRomano.length() && (numeroRomano.charAt(i + 1) == 'M' || numeroRomano.charAt(i + 1) == 'D' || numeroRomano.charAt(i + 1) == 'C')) {
                        numeroDecimal -= 50;
                    } else {
                        numeroDecimal += 50;
                    }
                    break;
                case 'X':
                    if (i + 1 < numeroRomano.length() && (numeroRomano.charAt(i + 1) == 'M' || numeroRomano.charAt(i + 1) == 'D' || numeroRomano.charAt(i + 1) == 'C' || numeroRomano.charAt(i + 1) == 'L')) {
                        numeroDecimal -= 10;
                    } else {
                        numeroDecimal += 10;
                    }
                    break;
                case 'V':
                    if (i + 1 < numeroRomano.length() && (numeroRomano.charAt(i + 1) == 'M' || numeroRomano.charAt(i + 1) == 'D' || numeroRomano.charAt(i + 1) == 'C' || numeroRomano.charAt(i + 1) == 'L' || numeroRomano.charAt(i + 1) == 'X')) {
                        numeroDecimal -= 5;
                    } else {
                        numeroDecimal += 5;
                    }
                    break;
                case 'I':
                    if (i + 1 < numeroRomano.length() && (numeroRomano.charAt(i + 1) == 'M' || numeroRomano.charAt(i + 1) == 'D' || numeroRomano.charAt(i + 1) == 'C' || numeroRomano.charAt(i + 1) == 'L' || numeroRomano.charAt(i + 1) == 'X' || numeroRomano.charAt(i + 1) == 'V')) {
                        numeroDecimal -= 1;
                    } else {
                        numeroDecimal += 1;
                    }
                    break;
            }
        }

        System.out.println("El numero en romano es " + numeroDecimal);
    }
}