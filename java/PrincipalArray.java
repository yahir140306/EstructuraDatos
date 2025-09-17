
import java.util.Scanner;

public class PrincipalArray {

    public static void main(String[] args) {
        // ArrayNumeros obj = new ArrayNumeros();
        // obj.Numeros[0] = 32;
        // obj.Numeros[4] = 23;
        // obj.llenarArray();
        // obj.calificaicones();
        // obj.mostrar();

        // obj.llenarArrayPalabra();
        // obj.palabras();
        AlmacenarNumeros objAlmacenarNumeros = new AlmacenarNumeros();

        int[] numeros = new int[5];
        Scanner scanner = new Scanner(System.in);
        // int opcion;
        // do {
        //     System.out.println("\n--- Menú de Opciones ---");
        //     System.out.println("1. Llenar arreglo");
        //     System.out.println("2. Mostrar el número mayor");
        //     System.out.println("3. Mostrar el número menor");
        //     System.out.println("5. Salir");
        //     System.out.print("Seleccione una opción: ");
        //     opcion = scanner.nextInt();
        //     switch (opcion) {
        //         case 1:
        //             objAlmacenarNumeros.llenarArreglo(numeros, scanner);
        //             break;
        //         case 2:
        //             objAlmacenarNumeros.mostrarNumeroMayor(numeros);
        //             break;
        //         case 3:
        //             objAlmacenarNumeros.mostrarNumeroMenor(numeros);
        //             break;
        //         case 5:
        //             System.out.println("Saliendo de la aplicación. ¡Hasta luego!");
        //             break;
        //         default:
        //             System.out.println("Opción no válida. Por favor, intente de nuevo.");
        //     }
        // } while (opcion != 5);
        // scanner.close();

        objAlmacenarNumeros.llenarArreglo2(numeros, scanner);
        objAlmacenarNumeros.ParImpar(numeros);
    }
}
