package Unidad_2.Herencia.Animales;

import Unidad_2.Herencia.Animales.Animal;

public class Perro extends Animal {
    private final String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    public void ladrar() {
        System.out.println(nombre + " ladrando. Raza: " + raza);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Guau!");
    }

    @Override
    public String toString() {
        return "Perro - " + super.toString() + ", Raza: " + raza;
    }
}
