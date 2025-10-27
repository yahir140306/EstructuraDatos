package Herencia.Vehiculo;

public class Helicoptero extends VehiculoAereo {
    public Helicoptero(String nombre, int velocidadMaxima) {
        super(nombre, velocidadMaxima, "Turbosina", 4500);
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " moviéndose");
    }
}
