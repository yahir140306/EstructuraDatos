package Unidad_2.Herencia.Vehiculo;

public class Tractor extends VehiculoTerrestre{
    public Tractor(String nombre) {
        super(nombre, 40, "Diesel", 4);
    }

    public void arar() {
        System.out.println(nombre + " arando tierra");
    }
}
