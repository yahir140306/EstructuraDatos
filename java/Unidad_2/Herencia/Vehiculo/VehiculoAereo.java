package Unidad_2.Herencia.Vehiculo;

public class VehiculoAereo extends Vehiculo {
    protected int alturaMaxima;

    public VehiculoAereo(String nombre, int velocidadMaxima, String tipoCombustible, int alturaMaxima) {
        super(nombre, velocidadMaxima, tipoCombustible);
        this.alturaMaxima = alturaMaxima;
    }

    public void planear() {
        System.out.println(nombre + " está planeando a una altura de " + alturaMaxima);
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " se desplaza por aire");
    }
}
