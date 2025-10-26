
import java.util.Scanner;

public class AlmacenarNumeros {

    public static void llenarArreglo(int[] arr, Scanner sc) {
        System.out.println("Ingrese 6 números enteros:");
        System.out.println("\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("\nArreglo llenado correctamente.");
    }

    public static void mostrarNumeroMayor(int[] arr) {
        int maximo = arr[0];
        // int posicion = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maximo) {
                maximo = arr[i];
                // posicion = i;
            }
        }
        System.out.println("El número mayor es: " + maximo);
    }

    public static void mostrarNumeroMenor(int[] arr) {
        int minimo = arr[0];
        // int posicion = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minimo) {
                minimo = arr[i];
                // posicion = i;
            }
        }
        System.out.println("El número menor es: " + minimo);
    }

    /////////////////////////////////////
    
    public static void llenarArreglo2(int[] arr, Scanner sc) {
        System.out.println("Ingrese 5 números enteros:");
        System.out.println("\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("\nArreglo llenado correctamente.");
    }

    public static void ParImpar(int[] arr) {
        int suma = 0;
        // int pares = arr[0];
        int mutiplicacion = 1;
        int countPar = 0;
        int countImpar = 0;
        // int posicion = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                suma += arr[i];
                countPar += 1;
                // posicion = i;
            }
            // impares
            if (arr[i] % 2 != 0) {
                mutiplicacion *= arr[i];
                countImpar += 1;
            }
        }
        System.out.println(countPar + " pares y la suma de los pares es: " + suma);
        System.out.println(countImpar + " impares y la multiplicación de los impares es: " + mutiplicacion);
    }
}
