import java.util.Scanner;

public class TiendaOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nIngrese nombre de usuario:");
        String nombreUsuario = scanner.nextLine();
        Usuario usuario = new Usuario(nombreUsuario);
        System.out.println("\nBienvenido " + usuario.nombre() + "!");

        String opcion;

        do {
            System.out.println("\nMenu");
            System.out.println("1.- Agregar producto al pedido");
            System.out.println("2.- Ver resumen y total al pedido");
            System.out.println("0.- Salir");

            System.out.println("Seleccione una opcion:");
            opcion = scanner.next();

            switch (opcion) {
                case "1":
                    agregarProductoUI(usuario.getPedido(), scanner);
                    break;
                case "2":
                    usuario.mostrarPedido();
                    break;
                case "0":
                    break;
                default:
                    System.out.println("\nElige una opcion del menu");
            }
        } while (!opcion.equals("0"));
        scanner.close();
    }

    private static void agregarProductoUI(Pedido pedido, Scanner scanner) {
        scanner.nextLine();
        System.out.println("\nNombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.println("\nPrecio unitario: ");
        double precio = scanner.nextDouble();

        System.out.println("\nCantidad: ");
        int cantidad = scanner.nextInt();

        Producto nuevoProducto = new Producto(nombre, precio, cantidad);
        pedido.agregarProducto(nuevoProducto);
    }
}
