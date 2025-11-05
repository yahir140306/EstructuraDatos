import java.util.Scanner;

public class principal {
    public static void main(String[] args) {

        String opcion = "";
        Scanner leer = new Scanner(System.in);

        CPila pilaPrincipal = new CPila();
        CPila pilaRehacer = new CPila();

        while (!(opcion.equals("4"))) {

            System.out.println("\n|----------------------------------------------------|");

            for (String item : pilaPrincipal.getPila()) {
                System.out.println("\n| " + item + " | ");
            }

            System.out.println("\n|----------------------------------------------------|");

            System.out.println("\nMenu Editor de Texto");
            System.out.println("\n1.-Agregar 2.-Deshacer 3.-Rehacer 4.-Salir");
            System.out.print("\nSelecciona una opción: ");
            opcion = leer.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("\nIngresa el texto: ");
                    pilaPrincipal.AgregarTexto(leer.nextLine());
                    pilaRehacer.getPila().clear();
                    break;
                case "2":

                    if (pilaPrincipal.getPila().empty()) {
                        System.out.println("\nNada para deshacer");
                        break;
                    }

                    pilaRehacer.getPila().push(pilaPrincipal.getPila().pop());

                    break;
                case "3":
                    if (pilaRehacer.getPila().empty()) {
                        System.out.println("\nNada para Rehacer");
                        break;
                    }

                    pilaPrincipal.getPila().push(pilaRehacer.getPila().pop());
                    break;
                case "4":

                    break;
                default:
                    System.out.println("\nSelecciona una opción válida");
                    break;
            }
        }
        leer.close();
    }
}
