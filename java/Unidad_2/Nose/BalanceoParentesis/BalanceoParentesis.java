import java.util.Scanner;
import java.util.Stack;

public class BalanceoParentesis {

    public static boolean estaBalanceada(String expresion) {
        Stack<Character> pila = new Stack<>();

        for (char caracter : expresion.toCharArray()) {

            if (caracter == '(') {
                pila.push(caracter);
            } else if (caracter == ')') {
                if (pila.isEmpty()) {
                    return false;
                }

                pila.pop();
            }

        }

        return pila.isEmpty();
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\nIngrese una expresión para analizar (o escriba 'salir' para terminar):");

            while (true) {
                System.out.print("\n-> ");
                String linea = scanner.nextLine();
                if (linea == null) {
                    break;
                }

                linea = linea.trim();
                if (linea.equalsIgnoreCase("salir") || linea.equalsIgnoreCase("exit")) {
                    break;
                }

                if (linea.isEmpty()) {
                    System.out.println("\n(Entrada vacía) Por favor ingrese una expresión o 'salir'.");
                    continue;
                }

                boolean balance = estaBalanceada(linea);
                System.out.println("\n¿Balanceada? " + (balance ? "Sí" : "No"));
            }
        }
    }
}