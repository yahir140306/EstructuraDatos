import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Burbuja_Calificaciones {
    private static final List<Estudiante> listaEstudiantes = new ArrayList<>();

    public static void main(String[] args) {
        // datos de ejemplo
        listaEstudiantes.add(new Estudiante("ABC001", "Juanchis", 7));
        listaEstudiantes.add(new Estudiante("ABC002", "Paco", 8.5));
        listaEstudiantes.add(new Estudiante("ABC003", "Panchito", 9));
        listaEstudiantes.add(new Estudiante("ABC004", "Panchita", 5));
        listaEstudiantes.add(new Estudiante("ABC004", "Jose", 6));

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
                System.out.println("8.- Ordenar calificaciones (quicksort)");
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

                    case "8":
                        System.out.println("\nOrdenando calificaciones con quicksort...");
                        quicksortOrdenarPorCalificacion(new ArrayList<>(listaEstudiantes), true);
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

    private static void burbujaOrdenarPorCalificacion(List<Estudiante> lista, boolean descendente) {
        int tamano = lista.size();
        int vueltas = 0;
        for (int pasada = 0; pasada < tamano - 1; pasada++) {
            boolean intercambio = false;
            for (int i = 0; i < tamano - 1 - pasada; i++) {
                double calificacionA = lista.get(i).getCalificacion();
                double calificacionB = lista.get(i + 1).getCalificacion();
                boolean debeIntercambiar = descendente ? (calificacionA < calificacionB)
                        : (calificacionA > calificacionB);
                if (debeIntercambiar) {
                    Estudiante temporal = lista.get(i);
                    lista.set(i, lista.get(i + 1));
                    lista.set(i + 1, temporal);
                    intercambio = true;
                }
            }
            vueltas++;
            if (!intercambio)
                break;
        }
        System.out.println("Burbuja completado. Vueltas totales: " + vueltas);
    }

    private static void quicksortOrdenarPorCalificacion(List<Estudiante> lista, boolean descendente) {
        int tamano = lista.size();
        Estudiante[] arreglo = lista.toArray(new Estudiante[0]);
        long[] contador = new long[1];
        quicksortRecursivo(arreglo, 0, tamano - 1, descendente, contador);
        for (int i = 0; i < tamano; i++) {
            lista.set(i, arreglo[i]);
        }
        System.out.println("Quicksort completado. Vueltas totales: " + contador[0]);
    }

    private static void quicksortRecursivo(Estudiante[] arreglo, int bajo, int alto, boolean descendente,
            long[] contador) {
        if (bajo < alto) {
            contador[0]++;
            int p = particion(arreglo, bajo, alto, descendente);
            quicksortRecursivo(arreglo, bajo, p - 1, descendente, contador);
            quicksortRecursivo(arreglo, p + 1, alto, descendente, contador);
        }
    }

    private static int particion(Estudiante[] arreglo, int bajo, int alto, boolean descendente) {
        double pivote = arreglo[alto].getCalificacion();
        int i = bajo - 1;
        for (int j = bajo; j <= alto - 1; j++) {
            boolean condicion = descendente ? (arreglo[j].getCalificacion() > pivote)
                    : (arreglo[j].getCalificacion() < pivote);
            if (condicion) {
                i++;
                Estudiante temporal = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temporal;
            }
        }
        Estudiante temporal = arreglo[i + 1];
        arreglo[i + 1] = arreglo[alto];
        arreglo[alto] = temporal;
        return i + 1;
    }

    private static void ordenarCalificacionesMenu(Scanner entrada) {
        if (listaEstudiantes.isEmpty()) {
            System.out.println("No hay estudiantes que ordenar.");
            return;
        }

        System.out.println("Seleccione el metodo de ordenamiento:");
        System.out.println("1.- Burbuja");
        System.out.println("2.- Quicksort");
        String metodo = entrada.next();

        System.out.println("Seleccione el orden:");
        System.out.println("1.- Mayor a menor");
        System.out.println("2.- Menor a mayor");
        String opcion = entrada.next();

        boolean descendente = "1".equals(opcion);

        List<Estudiante> copia = new ArrayList<>(listaEstudiantes);

        if ("1".equals(metodo)) {
            burbujaOrdenarPorCalificacion(copia, descendente);
        } else if ("2".equals(metodo)) {
            quicksortOrdenarPorCalificacion(copia, descendente);
        } else {
            System.out.println("Metodo no valido.");
            return;
        }

        System.out.println("Lista ordenada: ");
        for (Estudiante estudiante : copia) {
            System.out.println(estudiante);
        }
    }
}
