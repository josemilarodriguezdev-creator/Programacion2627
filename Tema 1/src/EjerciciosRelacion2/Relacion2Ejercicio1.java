package EjerciciosRelacion2;
//Realizar un programa que muestre por pantalla todos los números
//comprendidos entre 1 y 100 que son múltiplos de 7 o de 13. Debe mostrar
//un mensaje indicando si el número es múltiplo de 7 o de 13. Si el número
//es múltiplo de 7 y de 13 a la vez, deben aparecer dos mensajes.

public class Relacion2Ejercicio1 {
    public static void main(String[] args){

       for (int numeros = 1; numeros <=100; numeros++){
           if (numeros % 7==0){
               System.out.printf("el numero %d es múltiplo de 7 %n", numeros);
           }if (numeros % 13==0){
               System.out.printf("el numero %d es múltiplo de 13 %n", numeros);
           }
       }





    }
}
