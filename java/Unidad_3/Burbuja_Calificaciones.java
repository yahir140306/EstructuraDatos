import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Burbuja_Calificaciones {
    private static final List<Estudiante> listaEstudiantes = new ArrayList<>();

    public static void main(String[] args) {
        // datos de ejemplo
        listaEstudiantes.add(new Estudiante("ABC001", "Juanchis", 9));
        listaEstudiantes.add(new Estudiante("ABC002", "Paco", 8.5));
        listaEstudiantes.add(new Estudiante("ABC003", "Panchito", 7));
        try (Scanner scanner = new Scanner(System.in)) {
            String opcion;

            do {
                System.out.println("\nMenu");
                System.out.println("1.- Agregar estudiante");
                System.out.println("2.- Consultar estudiante por matricula");
                System.out.println("3.- Actualizar calificacion");
                System.out.println("4.- Eliminar estudiante");
                System.out.println("5.- Mostrar promedio general");
                System.out.println("6.- Mostrar todos los estudiantes");
                System.out.println("7.- Ordenar calificaciones (burbuja)");
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
                            System.out.println("\nCalificacion actual: " + aActualizar.getCalificacion());
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
                            break;
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
                            break;
                        }

                        for (Estudiante estudiante : listaEstudiantes) {
                            System.out.println("\n" + estudiante);
                        }
                        break;

                    case "7":
                        ordenarCalificacionesMenu(scanner);
                        break;

                    case "0":
                        break;

                    default:
                        System.out.println("\nIngrese una opcion que esta en el menu");
                }

            } while (!opcion.equals("0"));
        }
    }

    private static Estudiante buscarPorMatricula(String matricula) {
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getMatricula().equals(matricula)) {
                return estudiante;
            }
        }
        return null;
    }

    private static void ordenarCalificacionesMenu(Scanner scanner) {
        if (listaEstudiantes.isEmpty()) {
            System.out.println("\nNo hay estudiantes que ordenar.");
            return;
        }

        System.out.println("\nSeleccione el orden:");
        System.out.println("1.- Mayor a menor");
        System.out.println("2.- Menor a mayor");
        String opt = scanner.next();

        boolean descending = "1".equals(opt);

        // Hacemos una copia para no mutar la lista original
        List<Estudiante> copia = new ArrayList<>(listaEstudiantes);
        burbujaOrdenarPorCalificacion(copia, descending);

        System.out.println("\nLista ordenada: ");
        for (Estudiante e : copia) {
            System.out.println(e);
        }
    }

    private static void burbujaOrdenarPorCalificacion(List<Estudiante> lista, boolean descending) {
        int n = lista.size();
        for (int pass = 0; pass < n - 1; pass++) {
            boolean swapped = false;
            for (int i = 0; i < n - 1 - pass; i++) {
                double a = lista.get(i).getCalificacion();
                double b = lista.get(i + 1).getCalificacion();
                boolean debeIntercambiar = descending ? (a < b) : (a > b);
                if (debeIntercambiar) {
                    Estudiante tmp = lista.get(i);
                    lista.set(i, lista.get(i + 1));
                    lista.set(i + 1, tmp);
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }
}
