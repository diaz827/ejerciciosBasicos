import java.util.Random;
import java.util.Scanner;

public class EjerciciosBasicos5 {
    public static void main(String[] args) {

        Random nAleatorio = new Random();
        int entradaAleatoria = nAleatorio.nextInt(1,11);
        Scanner sc = new Scanner(System.in);

        boolean usuarioAcierta = true;
        int contador =0;
        while(usuarioAcierta){
            contador++;
            System.out.println("¿Cual es el numero con el que quieres probar?");

            int usuarioDa = sc.nextInt();
            if (usuarioDa == entradaAleatoria){
                System.out.println("Acertaste");
            } else {
                if(usuarioDa > entradaAleatoria){
                    System.out.println("Te pasaste");
                } else {
                    System.out.println("Te quedaste corto");
                }
            }
        }
        System.out.println("Has acabado");
        System.out.println("Utilizaste " +contador+ " intentos.");
    }
}
/*Adivina el número

Genera un número aleatorio del 1 al 10.
Pide al usuario que lo adivine usando un bucle while.
Si el número es mayor o menor, muestra una pista con un if.
Cuando acierte, imprime "¡Correcto! Has adivinado el número en X intentos!".
*/
