package Herencia.Vehiculo;

public class VehiculoTerrestre extends Vehiculo {
    protected int numeroRuedas;

    public VehiculoTerrestre(String nombre, int velocidadMaxima, String tipoCombustible, int numeroRuedas) {
        super(nombre, velocidadMaxima, tipoCombustible);
        this.numeroRuedas = numeroRuedas;
    }

    public void moverse() {
        System.out.println(nombre + " se desplaza por tierra con " + numeroRuedas + " ruedas");
    }
}
