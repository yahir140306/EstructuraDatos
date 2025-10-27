package Herencia.Animales;

public abstract class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void moverse() {
        System.out.println(nombre + " está moviendo");
    }

    public void comer() {
        System.out.println(nombre + " está comiendo");
    }

    public abstract void hacerSonido();

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}
