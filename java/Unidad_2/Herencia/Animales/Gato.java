package Herencia.Animales;

public class Gato extends Animal {
    private boolean esDomestico;

    public Gato(String nombre, int edad, boolean domestico) {
        super(nombre, edad);
        this.esDomestico = domestico;
    }

    public void ronronear() {
        String estado = esDomestico ? "feliz" : "silencioso";
        System.out.println(nombre + " está ronroneando: " + estado);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Miau");
    }

    @Override
    public String toString() {
        return "Gato - " + super.toString() + ", Doméstico: " + esDomestico;
    }
}
