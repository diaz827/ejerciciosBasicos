import java.util.Scanner;

public class EjerciciosBasicos3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la vida de tu pokemon:");
        int vida1 = sc.nextInt();

        System.out.println("Dime la vida del pokemon rival:");
        int vida2 = sc.nextInt();

        System.out.println("¿Cuanto daño quieres que haga tu pokemon?");
        int danho1 = sc.nextInt();

        System.out.println("¿Cuanto daño quieres que haga el otro pokemon?");
        int danho2 = sc.nextInt();

        int nAtaque = 0;
        while (vida1 > 0 && vida2 > 0) {
            nAtaque ++;
            System.out.println("\nNº ataque " +nAtaque);
            System.out.println("Ataca pokemon 1");
            vida1 = vida1 - danho2;
            System.out.println("Ataca el pokemon 1 y hace este daño: " + danho1);
            System.out.println("Ataca pokemon 2");
            vida2 = vida2 - danho1;
            System.out.println("Ataca el pokemon 2 y hace este daño: " + danho2);

            if (vida1 < 0) {
                vida1 = 0;

            }
            if  (vida2 < 0) {
                vida2 = 0;
            }

            System.out.println("Al pokemon 1 le quedan " +vida1+ " de vida y al pokemon 2 le quedan " +vida2+ " de vida.");

        }

           System.out.println("\nFin de batalla");

    }
}
