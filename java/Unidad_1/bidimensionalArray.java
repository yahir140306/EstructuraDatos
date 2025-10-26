
import java.util.Scanner;

public class bidimensionalArray {

    public static void main(String[] args) {

        bidimensional obj = new bidimensional();
        int[][] arreglo = new int[2][6];
        Scanner scanner = new Scanner(System.in);
        int opcion;
        boolean arrayLleno = false;

        do {
            System.out.println("Menu de opciones");
            System.out.println("1.- Llenar matriz");
            System.out.println("2.- Sumar matriz");
            System.out.println("3.- Sumar impares");
            System.out.println("4.- Buscar un numero");
            System.out.println("5.- Salir");

            System.out.println("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    obj.llenarArray(arreglo, scanner);
                    obj.verArray(arreglo);
                    arrayLleno = true;
                    break;
                case 2:
                    if (!arrayLleno) {
                        System.out.println("Primero debe llenar la matriz (opción 1).");
                    } else {
                        obj.sumarArray(arreglo);
                    }
                    break;
                case 3:
                    if (!arrayLleno) {
                        System.out.println("Primero debe llenar la matriz (opción 1).");
                    } else {
                        obj.sumarImpares(arreglo);
                    }
                    break;
                case 4:
                    if (!arrayLleno) {
                        System.out.println("Primero debe llenar la matriz (opción 1).");
                    } else {
                        obj.buscarNumero(arreglo, scanner);
                    }
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 5);
        scanner.close();

        // obj.llenarArray();
        // obj.verArray();
    }
}
