import java.util.Scanner;

public class EjerciciosBasicos1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos bloques quieres picar???");

        boolean picandoBloque1 = true;
        int bloques = sc.nextInt();

        for (int i = 1; i <= bloques; i++) {
            System.out.println("Picando bloque " + i + "...");

        }
    }
}

/*
El minero de Minecraft

Pide al usuario cuántos bloques quiere picar.
Usa un bucle for para simular que los va picando uno a uno e imprime mensajes como:
"Picando bloque 1...", "Picando bloque 2...", etc.
Al final, imprime "Has terminado de picar X bloques!"
*/
