import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        //int numero = 5;
        long factorial = 1;

        System.out.println("Introduce el valor: ");
        float cantidad = valor.nextFloat();
        for (int i = 1; i <=  cantidad; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + cantidad + " es: " + factorial);
    }
}
