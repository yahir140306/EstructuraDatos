package Unidad_2.Herencia.Personas;

public abstract class Persona {

    protected int matricula = 0;
    protected String nombre = "";
    protected String correo = "";
    protected String telefono = "";

    public void Estudiar() {
        System.out.println("Estudiar");
    }
}
