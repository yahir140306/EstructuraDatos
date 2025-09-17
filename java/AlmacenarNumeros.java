
import java.util.Arrays;
import java.util.Scanner;

public class AlmacenarNumeros {

    // public static void mostrarArregloAlReves(int[] arr) {
    //     if (arr[0] == 0 && Arrays.stream(arr).sum() == 0) {
    //         System.out.println("El arreglo está vacío. Por favor, llénelo primero (Opción 1).");
    //         return;
    //     }
    //     System.out.println("Arreglo al revés:");
    //     for (int i = arr.length - 1; i >= 0; i--) {
    //         System.out.println(arr[i]);
    //     }
    // }
    public static void llenarArreglo(int[] arr, Scanner sc) {
        System.out.println("Ingrese 6 números enteros:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Arreglo llenado correctamente.");
    }

    public static void mostrarNumeroMayor(int[] arr) {
        if (arr[0] == 0 && Arrays.stream(arr).sum() == 0) {
            System.out.println("El arreglo está vacío. Por favor, llénelo primero (Opción 1).");
            return;
        }

        int maximo = arr[0];
        int posicion = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maximo) {
                maximo = arr[i];
                posicion = i;
            }
        }
        System.out.println("El número mayor es: " + maximo);
        System.out.println("Se encuentra en la posición (índice) " + posicion);
    }

    public static void mostrarNumeroMenor(int[] arr) {
        if (arr[0] == 0 && Arrays.stream(arr).sum() == 0) {
            System.out.println("El arreglo está vacío. Por favor, llénelo primero (Opción 1).");
            return;
        }

        int minimo = arr[0];
        int posicion = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minimo) {
                minimo = arr[i];
                posicion = i;
            }
        }
        System.out.println("El número menor es: " + minimo);
        System.out.println("Se encuentra en la posición (índice) " + posicion);
    }
}
