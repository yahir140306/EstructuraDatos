package Unidad_2.Herencia.Vehiculo;

public class Vehiculo {
    protected String nombre;
    protected int velocidadMaxima;
    protected String tipoCombustible;

    public Vehiculo(String nombre, int velocidadMaxima, String tipoCombustible) {
        this.nombre = nombre;
        this.velocidadMaxima = velocidadMaxima;
        this.tipoCombustible = tipoCombustible;
    }

    public void arrancar() {
        System.out.println(nombre + " arrancando");
    }

    public void detener() {
        System.out.println(nombre + " detenido");
    }

    // Dejar moverse como método público a implementar por subclases
    public void moverse() {
        System.out.println(nombre + " se está moviendo");
    }

    public String getNombre() { return nombre; }
    public int getVelocidadMaxima() { return velocidadMaxima; }

    @Override
    public String toString() {
        return "Vehiculo: " + nombre + ", VelocidadMaxima: " + velocidadMaxima + ", Combustible: " + tipoCombustible;
    }
}
