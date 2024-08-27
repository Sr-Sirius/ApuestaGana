import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Michael Steeven Sanchez Fernandez
        // Das un monto inicial de dinero y lo apuestas
        // 27/08/2024
        Scanner scan = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("--------------------------------------");
        System.out.println("¡¡¡Apuesta Y Gana!!!");
        System.out.println("Introduce la cantidad de dinero con la que deseas empezar a jugar: ");
        double dinero = scan.nextDouble();

        boolean seguirJugando = true;

        while (seguirJugando && dinero > 0) {
            int numero = aleatorio.nextInt(1,4);
            System.out.println("Número generado: " + numero);

            switch (numero) {
                case 1:
                    dinero = dinero * 2;
                    System.out.println("¡Felicitaciones! Duplicaste tu dinero, ahora tienes: $" + dinero);
                    break;
                case 2:
                    dinero = dinero / 2;
                    System.out.println("Perdiste la mitad de tu dinero, te quedan: $" + dinero);
                    break;
                case 3:
                    System.out.println("¡Perdiste todo tu dinero! El juego ha terminado.");
                    dinero = 0;
                    seguirJugando = false;
                    break;
            }

            if (numero != 3 && dinero > 0) {
                System.out.println("¿Deseas seguir jugando? (si/no): ");
                String respuesta = scan.next();
                seguirJugando = respuesta.equalsIgnoreCase("si");
            }
        }
        System.out.println("El juego ha finalizado... Te fuiste con: $" + dinero);
        scan.close();
    }
}
