import java.util.Random;
import java.util.Scanner;

public class EjercicioBasico4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("¿Cuantas veces quieres lanzar la moneda?");
        int lanzamiento1 = sc.nextInt();

        double siguienteAleatorio = rand.nextDouble();

        int nVecesCara = 0;
        int nVecesCruz = 0;
        for (int i = 1; i <= lanzamiento1; i++) {
            System.out.println("Vamos a lanzar la moneda." +
                    "\n Nº " +i);
            boolean haSalidoCara = rand.nextBoolean();
            if (haSalidoCara) {
                //es cara
                nVecesCara++;
                System.out.println("Fue cara");
            } else if (!haSalidoCara) {
                //es cruz
                nVecesCruz++;
                System.out.println("Fue cruz");
            }
        }
        System.out.println("\nSalió " +nVecesCara+ " veces cara y " +nVecesCruz+ " veces cruz.");
    }
}

// en mi caso si da true es cara, false es cruz

/*
Simulador de lanzamiento de moneda

Pide al usuario cuántas veces quiere lanzar una moneda.
Usa un bucle for para generar resultados aleatorios (“cara” o “cruz”);
Cuenta cuántas veces salió cada uno y muestra el total al final.
        (Sugerencia: usa Math.random() y condicionales.)

 */