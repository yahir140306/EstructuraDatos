import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibrosPrincipal {
    public static void main(String[] args) {
        boolean encontrado = false;

        List<Libros> listaLibros = new ArrayList<Libros>();
        listaLibros.add(new Libros("libro 1", "autor 1", 2006, "terror", true));
        listaLibros.add(new Libros("libro 2", "autor 2", 2007, "aventuras", false));
        listaLibros.add(new Libros("libro 3", "autor 3", 2008, "infantil", true));

        String opcion;

        String noEncontrado = "\nNo encontrado";
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\nMenu");
            System.out.println("1.- Buscar libro por autor");
            System.out.println("2.- Buscar libro por genero");
            System.out.println("3.- Mostrar todos los libros");
            System.out.println("4.- Modificar disponibilidad");
            System.out.println("5.- Contar cuantos libros hay por genero");
            System.out.println("6.- Salir");

            System.out.println("\nSeleccione una opcion:");
            opcion = scanner.next();

            switch (opcion) {
                case "1":
                    encontrado = false;
                    scanner.nextLine();

                    System.out.println("\nIngrese el autor que buscas: ");
                    String buscarAutor = scanner.nextLine();

                    for (Libros libros : listaLibros) {
                        if (libros.getAutor().equalsIgnoreCase(buscarAutor)) {
                            System.out.println("\nEncontrado - Titulo: " + libros.getTitulo() + " - Autor: "
                                    + libros.getAutor() + " - Año: " + libros.getYear() + " - Genero: "
                                    + libros.getGenero() + " - Disponible: " + libros.getDisponible());
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println(noEncontrado);
                    }
                    break;

                case "2":
                    encontrado = false;
                    scanner.nextLine();

                    System.out.println("\nIngrese el genero que buscas: ");
                    String buscarGenero = scanner.nextLine();

                    for (Libros libros : listaLibros) {
                        if (libros.getGenero().equalsIgnoreCase(buscarGenero)) {
                            System.out.println("\nEncontrado - Titulo: " + libros.getTitulo() + " - Autor: "
                                    + libros.getAutor() + " - Año: " + libros.getYear() + " - Genero: "
                                    + libros.getGenero() + " - Disponible: " + libros.getDisponible());
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println(noEncontrado);
                    }

                    break;

                case "3":
                    for (Libros libros : listaLibros) {
                        System.out.println("\nTitulo: " + libros.getTitulo() + " - Autor: "
                                + libros.getAutor() + " - Año: " + libros.getYear() + " - Genero: "
                                + libros.getGenero() + " - Disponible: " + libros.getDisponible());
                    }
                    break;

                case "4":
                    encontrado = false;
                    scanner.nextLine();

                    System.out.println("\nIngrese el titulo para modificar su disponibilidad:");
                    String buscarTitulo = scanner.nextLine();

                    for (Libros libros : listaLibros) {
                        if (libros.getTitulo().equalsIgnoreCase(buscarTitulo)) {
                            encontrado = true;
                            System.out.println("\nLibro encontrado");
                            System.out.println("\nDisponibilidad actual: "
                                    + (libros.getDisponible() ? "Disponible" : "No disponible"));
                            System.out.println("\nCambiar disponibilidad? (Disponible - D | Prestado - P)");
                            String nuevaDispocion = scanner.nextLine().toUpperCase();

                            if (nuevaDispocion.equals("P")) {
                                libros.setDisponible(false);
                                System.out.println("\nEl libro: " + libros.getTitulo() + " esta ahora como PRESTADO");
                            } else if (nuevaDispocion.equals("D")) {
                                libros.setDisponible(true);
                                System.out.println("\nEl libro " + libros.getTitulo() + " esta ahora como DISPONIBLE");
                            } else {
                                System.out.println("No se realizo ningun cambio");
                            }
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println(noEncontrado);
                    }
                    break;

                case "5":
                    List<String> generosContados = new ArrayList<>();

                    for (Libros libros : listaLibros) {
                        String generoActual = libros.getGenero().toLowerCase();

                        if (!generosContados.contains(generoActual)) {
                            int contador = 0;
                            generosContados.add(generoActual);

                            for (Libros librosContar : listaLibros) {
                                if (librosContar.getGenero().toLowerCase().equals(generoActual)) {
                                    contador++;
                                }
                            }
                            System.out.println("\nGenero: " + generoActual + " - Cantidad: " + contador);
                        }
                    }
                    if (listaLibros.isEmpty()) {
                        System.out.println("Lista de libros esta vacio");
                    }
                    break;
                case "6":
                    break;
                default:
                    System.out.println("\nSeleccione unas de las opciones que ay en el menu :)");
            }

        } while (!opcion.equals("6"));
        scanner.close();
    }
}
