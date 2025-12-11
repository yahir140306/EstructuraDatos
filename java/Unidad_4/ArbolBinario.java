public class ArbolBinario {

    static class Nodo {
        int valor;
        Nodo izquierdo;
        Nodo derecho;

        Nodo(int valor) {
            this.valor = valor;
            this.izquierdo = null;
            this.derecho = null;
        }
    }

    Nodo raiz;

    ArbolBinario() {
        this.raiz = null;
    }

    void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    Nodo insertarRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            return new Nodo(valor);
        }

        if (valor < nodo.valor) {
            nodo.izquierdo = insertarRecursivo(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = insertarRecursivo(nodo.derecho, valor);
        }

        return nodo;
    }

    void recorrerEnOrden() {
        recorrerEnOrdenRecursivo(raiz);
        System.out.println();
    }

    void recorrerEnOrdenRecursivo(Nodo nodo) {
        if (nodo != null) {
            recorrerEnOrdenRecursivo(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            recorrerEnOrdenRecursivo(nodo.derecho);
        }
    }

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        System.out.println("Insertando numeros en el arbol: 5, 3, 7, 1, 4, 6, 8");
        arbol.insertar(5);
        arbol.insertar(3);
        arbol.insertar(7);
        arbol.insertar(1);
        arbol.insertar(4);
        arbol.insertar(6);
        arbol.insertar(8);


        System.out.print("Recorrido en orden (izquierda-raiz-derecha): ");
        arbol.recorrerEnOrden();
    }
}
