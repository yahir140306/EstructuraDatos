
import java.util.Scanner;

public class ArrayNumeros {

    int[] Numeros = new int[5];
    String[] palabras = new String[5];
    Scanner leer = new Scanner(System.in);

    void mostrar() {
        // for (int i = 4; i >= 0; i--) {
        //     // Numeros[i] = i;
        //     System.out.print(Numeros[i] + " ");
        // }
        for (int i = 0; i < 5; i++) {
            // Numeros[i] = i;
            System.out.print(Numeros[i] + " ");
        }
    }

    void llenarArray() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce el valor del indice " + i + " : ");
            Numeros[i] = leer.nextInt();
        }
    }

    void calificaicones() {
        float suma = 0;
        float promedio = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce la calificacion " + (i + 1) + " : ");
            Numeros[i] = leer.nextInt();
            suma += Numeros[i];
        }
        promedio = suma / 5;

        System.out.println("Promedio es: " + promedio);
    }

    void llenarArrayPalabra() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce una palabra " + (i + 1) + " : ");
            palabras[i] = leer.next();
        }
    }

    void palabras() {
        String buscarPalabra = " ";
        boolean encontrar = false;
        System.out.println("Que palabra quieres buscar: ");
        buscarPalabra = leer.next();
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equals(buscarPalabra)) {
                System.out.println("Palabra encontrada en la posicion  " + i + " " + palabras[i]);
                encontrar = true;
                break;
            }
        }
        if (!encontrar) {
            System.out.println("La palabra no se encuntra en el array");
        }
    }
}
