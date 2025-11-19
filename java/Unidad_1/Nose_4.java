
import java.util.Scanner;

public class Nose_4 {

    public static void main(String[] args) {

        Operaciones oper = new Operaciones();
        Scanner Leer = new Scanner(System.in);
        // int suma = oper.Sumar(6, 7);
        // System.out.println("La suma es: " + suma);

        System.out.println("Introduce el valor1 : ");
        oper.num1 = Leer.nextInt();

        System.out.println("Introduce el valor2: ");
        oper.num2 = Leer.nextInt();

        int suma = oper.Sumar();
        int resta = oper.Restar();
        float multi = oper.Multi();
        float div = oper.Div();

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multi);
        System.out.println("La division es: " + div);
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

        float Multi() {
            float multi = num1 * num2;
            return multi;
        }

        float Div() {
            float div = num1 / num2;
            return div;
        }
    }
}
