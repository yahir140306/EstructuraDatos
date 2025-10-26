
import java.util.Scanner;

public class gato {

    public static void main(String[] args) {
        String[][] arreglo = new String[3][3];
        Scanner scanner = new Scanner(System.in);
        gato_logic objeto = new gato_logic();

        String jugadorActual = "X";
        boolean juegoTerminado = false;

        System.out.println("¡Bienvenido al Juego del Gato!");
        System.out.println("Los jugadores son X y O");
        System.out.println("Para jugar, ingresa el número de la posición (1-9)");
        System.out.println();

        // Inicializar tablero
        objeto.inicializarTablero(arreglo);

        // Bucle principal del juego
        while (!juegoTerminado) {
            // Mostrar tablero
            objeto.verArray(arreglo);

            // Pedir movimiento al jugador actual
            System.out.println("Turno del jugador: " + jugadorActual);
            System.out.print("Ingresa la posición (1-9): ");

            int posicion = scanner.nextInt();

            // Validar posición
            if (posicion < 1 || posicion > 9) {
                System.out.println("Posición inválida. Debe ser entre 1 y 9.");
                continue;
            }

            // Hacer movimiento
            if (objeto.hacerMovimiento(arreglo, posicion, jugadorActual)) {
                // Verificar si hay ganador
                if (objeto.verificarGanador(arreglo, jugadorActual)) {
                    objeto.verArray(arreglo);
                    System.out.println("¡Felicidades! El jugador " + jugadorActual + " ha ganado!");
                    juegoTerminado = true;
                } // Verificar empate
                else if (objeto.tableroLleno(arreglo)) {
                    objeto.verArray(arreglo);
                    System.out.println("¡Empate! El tablero está lleno.");
                    juegoTerminado = true;
                } // Cambiar turno
                else {
                    jugadorActual = jugadorActual.equals("X") ? "O" : "X";
                }
            } else {
                System.out.println("Esa posición ya está ocupada. Intenta otra.");
            }
        }

        scanner.close();
        System.out.println("¡Gracias por jugar!");
    }
}
