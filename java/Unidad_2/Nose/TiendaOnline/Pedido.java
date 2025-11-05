
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Producto> listaProductos;

    public Pedido() {
        this.listaProductos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        if (producto != null) {
            listaProductos.add(producto);
            System.out.println("\nProducto " + producto.getNombre() + " agregado");
        }
    }

    public double calcularTotal() {
        double total = 0;

        for (Producto producto : listaProductos) {
            total += producto.calcularSubtotal();
        }

        return total;
    }

    public void mostrarResumen() {
        if (listaProductos.isEmpty()) {
            System.out.println("\nPedido esta vacio");
            return;
        }
        System.out.println("\nProductos: ");
        for (int i = 0; i < listaProductos.size(); i++) {
            System.out.println(" " + (i + 1) + " " + listaProductos.get(i));
        }

        System.out.printf("\nTotal a pagar: $%.2f%n", calcularTotal());
    }
}
