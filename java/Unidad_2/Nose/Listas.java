
import java.util.ArrayList;
import java.util.List;

public class Listas {

    public static void main(String[] args) {
        Persona nuevaPersona = new Persona(1, "Robert", 12);
        System.out.println(nuevaPersona.getNombre());

        List<Persona> lista = new ArrayList<Persona>();
        lista.add(new Persona(1, " Juanchis ", 17));
        lista.add(new Persona(2, " Jaimito ", 18));
        lista.add(new Persona(3, " Jacinto ", 15));
        lista.add(new Persona(4, " Julian ", 23));

        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i).getNum());
            System.out.print(lista.get(i).getNombre());
            System.out.print(lista.get(i).getEdad());

            System.out.println(" ");
        }

        for (Persona persona : lista) {
            System.out.print(persona.getNum());
            System.out.print(" " + persona.getNombre() + " ");
            System.out.print(persona.getEdad());

            System.out.println(" ");
        }
    }
}
