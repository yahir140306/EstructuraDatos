package Unidad_2.Herencia.Vehiculo;

public class Avion extends VehiculoAereo{
    public Avion(String nombre, int velocidadMaxima, int alturaMaxima){
        super(nombre, velocidadMaxima, "Turbosina", alturaMaxima);
    }

    public void aterrizar() {
        System.out.println(nombre + " aterrizando...");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " está volando");
    }
}
