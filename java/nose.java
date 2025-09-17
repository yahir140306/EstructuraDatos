import java.util.Scanner;

public class nose {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        cuenta objetoCuenta = new cuenta();

        float saldo = objetoCuenta.setSaldo(120.50f);
        System.out.println("El saldo es: " + saldo);

        System.out.println("Introduce tu nombre de cliente: ");
        String nombre = read.nextLine();
        objetoCuenta.setCliente(nombre);
        System.out.println("Bienvenido al banco DSM " + objetoCuenta.getCliente());

        System.out.println("¿Cuanto deseas retirar?: ");
        float retiro = read.nextFloat();

        System.out.println("El saldo es: " + objetoCuenta.Retiro(retiro));

        read.close();
    }
}
