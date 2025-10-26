package Unidad_2.Herencia.Vehiculo;

public class VehiculoAcuatico extends Vehiculo {
    protected boolean tieneCasco;

    public VehiculoAcuatico(String nombre, int velocidadMaxima, String tipoCombustible, boolean tieneCasco) {
        super(nombre, velocidadMaxima, tipoCombustible);
        this.tieneCasco = tieneCasco;
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " se desplaza por agua");
    }

    public void anclar() {
        System.out.println(nombre + " está anclando");
    }
}
