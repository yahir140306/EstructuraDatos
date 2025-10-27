package Herencia.Vehiculo;

public class Motocicleta extends VehiculoTerrestre {
    public Motocicleta(String nombre, int velocidadMaxima) {
        super(nombre, velocidadMaxima, "Gasolina", 2);
    }

    @Override
    public void arrancar() {
        System.out.println(nombre + " se ha encendido");
    }
}
