
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean encontrado = false;

        List<Canciones> listaCancioneses = new ArrayList<Canciones>();
        listaCancioneses.add(new Canciones("Cancion 1", "Artista 1", "Autor 1"));
        listaCancioneses.add(new Canciones("Cancion 2", "Artista 2", "Autor 2"));
        listaCancioneses.add(new Canciones("Cancion 3", "Artista 3", "Autor 3"));
        String opcion;

        String noEncontrado = "\nNo encontrado";
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\nMenu");
            System.out.println("1.- Ver todas las canciones");
            System.out.println("2.- Agregar cancion");
            System.out.println("3.- Buscar cancion por titulo");
            System.out.println("4.- Buscar cancion por artista");
            System.out.println("5.- Buscar cancion por autor");
            System.out.println("6.- Salir");

            System.out.println("\nSeleccione una opcion: ");
            opcion = scanner.next();

            switch (opcion) {
                case "1":
                    for (Canciones cancion : listaCancioneses) {
                        System.out.println("\nTitulo: " + cancion.getTitulo() + ", Artista: " + cancion.getArtista()
                                + ", Autor: " + cancion.getAutor());
                    }
                    break;
                case "2":
                    scanner.nextLine();
                    System.out.println("\nIngrese el titulo de la cancion: ");
                    String titulo = scanner.nextLine();
                    System.out.println("\nIngrese el artista de la cancion: ");
                    String artista = scanner.nextLine();
                    System.out.println("\nIngrese el autor de la cancion: ");
                    String autor = scanner.nextLine();

                    if (titulo.isEmpty() || artista.isEmpty() || autor.isEmpty()) {
                        System.out.println(
                                "\nNo esta completo algun campo para hacer el registro completo.\nIntentarlo de nuevo.");
                    } else {
                        listaCancioneses.add(new Canciones(titulo, artista, autor));
                        System.out.println("\nCancion agregada exitosamente.");
                    }
                    break;
                case "3":
                    encontrado = false;
                    scanner.nextLine();
                    System.out.println("\nIngrese el titulo de la cancion a buscar: ");
                    String buscarTitulo = scanner.nextLine();
                    for (Canciones cancion : listaCancioneses) {
                        if (cancion.getTitulo().equalsIgnoreCase(buscarTitulo)) {
                            System.out.println("\nEncontrado - Titulo: " + cancion.getTitulo() + ", Artista: "
                                    + cancion.getArtista() + ", Autor: " + cancion.getAutor());

                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println(noEncontrado);
                    }
                    break;
                case "4":
                    encontrado = false;

                    scanner.nextLine();
                    System.out.println("\nIngrese el artista de la cancion a buscar: ");
                    String buscarArtista = scanner.nextLine();
                    for (Canciones cancion : listaCancioneses) {
                        if (cancion.getArtista().equalsIgnoreCase(buscarArtista)) {
                            System.out.println("\nEncontrado - Titulo: " + cancion.getTitulo() + ", Artista: "
                                    + cancion.getArtista() + ", Autor: " + cancion.getAutor());
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println(noEncontrado);
                    }
                    break;
                case "5":
                    encontrado = false;

                    scanner.nextLine();
                    System.out.println("\nIngrese el autor de la cancion a buscar: ");
                    String buscarAutor = scanner.nextLine();
                    for (Canciones cancion : listaCancioneses) {
                        if (cancion.getAutor().equalsIgnoreCase(buscarAutor)) {
                            System.out.println("\nEncontrado - Titulo: " + cancion.getTitulo() + ", Artista: "
                                    + cancion.getArtista() + ", Autor: " + cancion.getAutor());
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println(noEncontrado);
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
