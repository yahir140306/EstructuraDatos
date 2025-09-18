
public class bidimensional {

    int[][] Alumnos = new int[4][5];

    void llenarArray() {
        for (int fila = 0; fila < 4; fila++) {
            for (int col = 0; col < 5; col++) {
                Alumnos[fila][col] = col;
            }
        }
    }

    void verArray() {
        for (int fila = 0; fila < 4; fila++) {
            for (int col = 0; col < 5; col++) {
                // Alumnos[fila][col] = col;
                System.out.print(Alumnos[fila][col] + " ");
            }
            System.out.println();
        }
    }
}
