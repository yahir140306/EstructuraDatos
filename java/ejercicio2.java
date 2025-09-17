
import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Operaciones oper = new Operaciones();
        Scanner digito = new Scanner(System.in);

        System.out.println("Calculadora Basica");
        System.out.println("1.-Suma     2.-Resta");
        System.out.println("3.-Multi    4.-Div");
        System.out.println("Que operacion quiere hacer: ");
        int opcion = digito.nextInt();

        System.out.println("Introduce el valor1: ");
        oper.num1 = digito.nextInt();
        System.out.println("Introduce el valor2: ");
        oper.num2 = digito.nextInt();

        switch (opcion) {
            case 1 ->
                System.out.println("La suma es: " + oper.Sumar());
            case 2 ->
                System.out.println("La resta es: " + oper.Restar());
            case 3 ->
                System.out.println("La multi es: " + oper.Multi());
            case 4 ->
                System.out.println("La div es: " + oper.Div());
            default ->
                throw new AssertionError();
        }
    }

    static class Operaciones {

        int num1 = 0;
        int num2 = 0;

        int Sumar() {
            int suma = num1 + num2;
            return suma;
        }

        int Restar() {
            int resta = num1 - num2;
            return resta;
        }

        int Multi() {
            int multi = num1 * num2;
            return multi;
        }

        int Div() {
            int div = num1 / num2;
            return div;
        }
    }
}
