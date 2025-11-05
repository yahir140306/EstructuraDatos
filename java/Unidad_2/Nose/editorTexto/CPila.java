import java.util.Stack;

public class CPila {

    private Stack<String> pila = new Stack<>();

    public Stack<String> getPila() {
        return pila;
    }

    public void AgregarTexto(String pTexto) {
        pila.push(pTexto);
    }

    public String Deshacer() {
        return pila.pop();
    }

}