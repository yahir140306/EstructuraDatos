
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionPrincipal {
    private static List<Estudiante> listaEstudiantes = new ArrayList<>();

    public static void main(String[] args) {
        listaEstudiantes.add(new Estudiante("ABC001", "Juanchis", 9));
        listaEstudiantes.add(new Estudiante("ABC002", "Paco", 8.5));
        listaEstudiantes.add(new Estudiante("ABC003", "Panchito", 7));

        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("\nMenu");
            System.out.println("1.- Agregar estudiante");
            System.out.println("2.- Consultar estudiante por matricula");
            System.out.println("3.- Actualizar calificacion");
            System.out.println("4.- Eliminar estudiante");
            System.out.println("5.- Mostrar promedio general");
            System.out.println("6.- Mostrar todos los estudiantes");
            System.out.println("0.- Salir");
            System.out.println("\nSeleccione una opcion: ");

            opcion = scanner.next();

            switch (opcion) {
                case "1":
                    System.out.println("\nIngrese la matricula:");
                    String matricula = scanner.next();

                    if (buscarPorMatricula(matricula) != null) {
                        System.out.println("\nError. Ya existe esta matricula");
                        break;
                    }

                    System.out.println("\nIngrese nombre:");
                    String nombre = scanner.next();

                    System.out.println("\nIngrese calificacion:");
                    double cal = scanner.nextDouble();

                    listaEstudiantes.add(new Estudiante(matricula, nombre, cal));
                    System.out.println("Estudiante agregado correctamente.");

                    break;

                case "2":
                    System.out.println("\nIngrese la matricula a consultar:");
                    String matriculaConsulta = scanner.next();

                    Estudiante encontrado = buscarPorMatricula(matriculaConsulta);

                    if (encontrado != null) {
                        System.out.println("\nEstudiante encontrado");
                        System.out.println(encontrado);
                    } else {
                        System.out.println("\nEstudiante no encontrado.");
                    }
                    break;

                case "3":
                    System.out.println("\nIngrese la matricula a actualizar");
                    String matriculaActualizar = scanner.next();

                    Estudiante aActualizar = buscarPorMatricula(matriculaActualizar);

                    if (aActualizar != null) {
                        System.out.println("\nCalificacion actual" + aActualizar.getCalificacion());
                        System.out.println("\nIngrese la nueva calificacion: ");
                        double nuevaCalificacion = scanner.nextDouble();

                        aActualizar.setCalificacion(nuevaCalificacion);
                        System.out.println("\nCalificacion actualizada " + aActualizar.getCalificacion());
                    } else {
                        System.out.println("\nEstudiante no encontrado");
                    }

                    break;

                case "4":
                    System.out.println("\nIngrese la matricula del estudiante: ");
                    String matriculaDelet = scanner.next();

                    Estudiante aElminar = buscarPorMatricula(matriculaDelet);

                    if (aElminar != null) {
                        listaEstudiantes.remove(aElminar);
                        System.out.println("\nEstudiante eliminado");
                    } else {
                        System.out.println("\nEstudiante no encontrado");
                    }
                    break;

                case "5":
                    if (listaEstudiantes.isEmpty()) {
                        System.out.println("Lista de estudiantes vacia");
                    }

                    double sumaCalificaciones = 0;

                    for (Estudiante estudiante : listaEstudiantes) {
                        sumaCalificaciones += estudiante.getCalificacion();
                    }

                    double promedio = sumaCalificaciones / listaEstudiantes.size();
                    System.out.println("Promedio general entre estudiantes " + promedio);

                    break;

                case "6":
                    if (listaEstudiantes.isEmpty()) {
                        System.out.println("Lista de estudiantes vacia");
                    }

                    for (Estudiante estudiante : listaEstudiantes) {
                        System.out.println("\n" + estudiante);
                    }
                    break;

                default:
                    System.out.println("\nIngrese una opcion que esta en el menu");
            }

        } while (!opcion.equals("0"));
        scanner.close();
    }

    private static Estudiante buscarPorMatricula(String matricula) {
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getMatricula().equals(matricula)) {
                return estudiante;
            }
        }
        return null;
    }

}
