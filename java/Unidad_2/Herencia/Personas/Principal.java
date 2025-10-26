package Herencia.Personas;

public class Principal {
    public static void main(String[] args) {
        Estudiante miEstudiante = new Estudiante();
        miEstudiante.Estudiar();
        Docente miDocente = new Docente();
        miDocente.Estudiar();
    }
}
