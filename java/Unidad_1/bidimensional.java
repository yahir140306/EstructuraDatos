
import java.util.Scanner;

public class bidimensional {

    // void llenarArray(int[] fila, int[] col, Scanner sc) {
    //     System.out.println("Llene la matriz");
    //     System.out.println();
    //     for (int fila = 0; fila < 2; fila++) {
    //         System.out.println("Numero " + (fila + 1) + ": ");
    //         fila[i] = sc.nextInt();
    //         for (int col = 0; col < 5; col++) {
    //             Alumnos[fila][col] = col;
    //         }
    //     }
    // }
    void llenarArray(int[][] matriz, Scanner sc) {
        System.out.println("Llenar la matriz:");
        System.out.println("\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Número [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        // for (int j = 0; j < matriz[0].length; j++) {
        //     System.out.println("Número [0][" + j + "]: " + matriz[0][j]);
        // }
        System.out.println("\nArreglo llenado correctamente.");
    }

    void verArray(int[][] matriz) {
        System.out.println("Contenido de la matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    void sumarArray(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println("La suma de todos los elementos es: " + suma);
    }

    void sumarImpares(int[][] matriz) {
        int sumaImpares = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] % 2 != 0) {
                    sumaImpares += matriz[i][j];
                }
            }
        }
        System.out.println("La suma de impares es: " + sumaImpares);
    }

    void buscarNumero(int[][] matriz, Scanner sc) {
        int numeroBuscar = 0;
        boolean encontrar = false;
        int count = 0;
        System.out.println("Numero a buscar: ");
        numeroBuscar = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numeroBuscar) {
                    System.out.println("Numero encontrada en la posicion " + matriz[i][j]);
                    encontrar = true;
                    count += 1;
                    System.out.println("El numero se encuentra " + count + " veces en la array");
                    break;
                }
            }
        }
        if (!encontrar) {
            System.out.println("Numero no encontrado en la array");
        }
    }
}
