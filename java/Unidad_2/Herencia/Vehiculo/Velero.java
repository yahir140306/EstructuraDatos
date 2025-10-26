package Unidad_2.Herencia.Vehiculo;

public class Velero extends VehiculoAcuatico {
    public Velero(String nombre) {
        super(nombre, 30, "Viento", true);
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " usa el viento");
    }
}
