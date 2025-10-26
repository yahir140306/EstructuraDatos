package Herencia.Personas;

import Unidad_2.Herencia.Personas.Persona;

public class Estudiante extends Persona {

    @Override
    public void Estudiar() {
        System.out.println("Examen");
    }

    public void Duerme() {
        System.out.println("Esta durmiendo");
    }

    public void Come() {
        System.out.println("Come");
    }

}
