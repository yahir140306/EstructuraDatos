import java.util.Scanner;

public class TiendaOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pedido miPedido = new Pedido();

        String opcion;

        do {
            System.out.println("\nMenu");
            System.out.println("1.- Agregar producto al pedido");
            System.out.println("2.- Ver resumen y total al pedido");
            System.out.println("0.- Finalizar y salir");

            System.out.println("Seleccione una opcion:");
            opcion = scanner.next();

            switch (opcion) {
                case "1":
                    agregarProductoUI(miPedido, scanner);
                    break;
                case "2":
                    miPedido.mostrarResumen();
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Elige una opcion del menu");
            }
        } while (!opcion.equals("6"));
        scanner.close();
    }

    private static void agregarProductoUI(Pedido pedido, Scanner scanner) {
        scanner.nextLine();
        System.out.println("Nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.println("Precio unitario: ");
        double precio = scanner.nextDouble();

        System.out.println("Cantidad: ");
        int cantidad = scanner.nextInt();

        Producto nuevoProducto = new Producto(nombre, precio, cantidad);
        pedido.agregarProducto(nuevoProducto);
    }
}
