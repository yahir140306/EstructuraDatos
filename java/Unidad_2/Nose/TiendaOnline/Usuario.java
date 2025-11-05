public class Usuario {
    private String nombre;
    private Pedido pedido;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.pedido = new Pedido();
    }

    public String nombre() {
        return nombre;
    }

    public void nombre(String nombre) {
        this.nombre = nombre;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void agregarProducto(Producto producto) {
        if (producto != null) {
            pedido.agregarProducto(producto);
        }
    }

    public void mostrarPedido() {
        pedido.mostrarResumen();
    }

    @Override
    public String toString() {
        return "Usuario: " + nombre;
    }

}