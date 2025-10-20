import java.util.Scanner;

public class EjerciciosBasicos2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce precio del gatorade.");
        int gatorade = sc.nextInt();

        System.out.println("Cuanto dinero llevas encima???");
        int saldo = sc.nextInt();

        while (saldo >= gatorade){
            System.out.println("Estas comprando un refresco de " +gatorade);
            saldo =  saldo - gatorade;
            System.out.println("Te quedan" +saldo+ "€");
            System.out.println("¿Cuanto cuesta el siguiente refresco?");
            gatorade = sc.nextInt();
        }
        System.out.println("No te llega para comprar más.");

    }
}

/*
La máquina de refrescos

Pide al usuario su saldo y el precio del refresco.
Si tiene dinero suficiente, calcula el cambio y muestra "Aquí tienes tu refresco y tu cambio: X €".
        Si no, muestra "Saldo insuficiente 😞".
Permite repetir la compra con un bucle while hasta que el usuario introduzca saldo suficiente.
*/