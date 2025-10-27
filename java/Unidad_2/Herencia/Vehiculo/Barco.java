package Herencia.Vehiculo;

public class Barco extends VehiculoAcuatico {
    public Barco(String nombre, int velocidadMaxima) {
        super(nombre, velocidadMaxima, "Diesel", true);
    }

    public void anclar() {
        System.out.println(nombre + " anclando");
    }
}
