

public class gato_logic {

    // Inicializar tablero con números de posición
    void inicializarTablero(String[][] matriz) {
        int posicion = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = String.valueOf(posicion);
                posicion++;
            }
        }
    }

    // void llenarGato(String[][] matriz, Scanner sc) {
    //     for (int x = 0; x < matriz.length; x++) {
    //         for (int y = 0; y < matriz[1].length; y++) {
    //             System.out.println("[" + x + "][" + y + "]: ");
    //             matriz[x][y] = sc.next();
    //         }
    //     }
    //     System.out.println("Juego Terminado");
    // }

    void verArray(String[][] matriz) {
        for (int pintar = 0; pintar < matriz.length; pintar++) {
            System.out.println(matriz[pintar][0] + " | " + matriz[pintar][1] + " | " + matriz[pintar][2]);
            System.out.println("----------");
        }
        System.out.println(" ");
    }

    // Realizar un movimiento en el tablero
    boolean hacerMovimiento(String[][] matriz, int posicion, String jugador) {
        int fila = (posicion - 1) / 3;
        int columna = (posicion - 1) % 3;

        // Verificar si la posición está disponible
        if (matriz[fila][columna].equals("X") || matriz[fila][columna].equals("O")) {
            return false; // Posición ocupada
        }

        matriz[fila][columna] = jugador;
        return true; // Movimiento exitoso
    }

    // Verificar si hay un ganador
    boolean verificarGanador(String[][] matriz, String jugador) {
        // Verificar filas
        for (int i = 0; i < 3; i++) {
            if (matriz[i][0].equals(jugador) && matriz[i][1].equals(jugador) && matriz[i][2].equals(jugador)) {
                return true;
            }
        }

        // Verificar columnas
        for (int j = 0; j < 3; j++) {
            if (matriz[0][j].equals(jugador) && matriz[1][j].equals(jugador) && matriz[2][j].equals(jugador)) {
                return true;
            }
        }

        // Verificar diagonales
        if (matriz[0][0].equals(jugador) && matriz[1][1].equals(jugador) && matriz[2][2].equals(jugador)) {
            return true;
        }
        if (matriz[0][2].equals(jugador) && matriz[1][1].equals(jugador) && matriz[2][0].equals(jugador)) {
            return true;
        }

        return false;
    }

    // Verificar si el tablero está lleno (empate)
    boolean tableroLleno(String[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!matriz[i][j].equals("X") && !matriz[i][j].equals("O")) {
                    return false;
                }
            }
        }
        return true;
    }
}
