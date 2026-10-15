package EjerciciosPrueba;

import java.util.Scanner;

public class EjercicioPrueba3 {
    public static void main(String[] args) {

        final String PASSWORD = "contraseña";
        Scanner sc = new Scanner(System.in);
        String contraseñaUsuario = "";

        do {
            System.out.println("Introduce la contraseña correcta");
            contraseñaUsuario = sc.nextLine();
            
        } while (!PASSWORD.equals(contraseñaUsuario));
        System.out.println("es la contraseña correcta");

    }
}
