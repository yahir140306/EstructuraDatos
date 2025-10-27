package Herencia.Animales;

public class Pez extends Animal {
    private final String tipoAgua;

    public Pez(String nombre, int edad, String tipoAgua) {
        super(nombre, edad);
        this.tipoAgua = tipoAgua;
    }

    @Override
    public void moverse() {
        System.out.println("Pez mover" + tipoAgua);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Pez hacerSonido de " + tipoAgua);
    }
}
