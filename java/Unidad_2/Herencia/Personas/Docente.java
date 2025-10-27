package Herencia.Personas;

public class Docente extends Persona {

    @Override
    public void Estudiar() {
        System.out.println("Para un tema de clase");
    }

    public void RepruebaAlumnos() {
        System.out.println("Afirmativo");
    }

    public void DarClases() {
        System.out.println("Da clase");
    }

    public void HacerPlanacion() {
        System.out.println("Hacer planacion");
    }
}
