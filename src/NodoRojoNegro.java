class NodoRojoNegro extends Arbol {
    NodoRojoNegro raiz;
    int valor;
    int color; // 0 para negro, 1 para rojo
    NodoRojoNegro izquierdo;
    NodoRojoNegro derecho;

    NodoRojoNegro(int valor) {
        this.valor = valor;
        this.color = 1; // Los nuevos nodos son siempre rojos en un árbol rojo-negro
    }

    @Override
    public void añadir(int valor) {
        this.raiz = añadirNodo(this.raiz, valor);
    }

    private NodoRojoNegro añadirNodo(NodoRojoNegro nodo, int valor) {
        // Si el árbol está vacío, devuelve un nuevo nodo
        if (nodo == null) {
            return new NodoRojoNegro(valor);
        }

        // De lo contrario, recurre por el árbol
        if (valor < nodo.valor) {
            nodo.izquierdo = añadirNodo(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = añadirNodo(nodo.derecho, valor);
        } else {
            // No se permiten duplicados, devuelve el nodo actual
            return nodo;
        }

        // Actualiza el color del nodo padre como rojo
        nodo.color = 1;
        return nodo;
    }

    @Override
    public void remover(int valor) {
        this.raiz = removerNodo(this.raiz, valor);
    }

    @Override
    public void inOrder() {

    }

    private NodoRojoNegro removerNodo(NodoRojoNegro nodo, int valor) {
        // Si el árbol está vacío, devuelve null
        if (nodo == null) {
            return nodo;
        }

        // De lo contrario, recurre por el árbol
        if (valor < nodo.valor) {
            nodo.izquierdo = removerNodo(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = removerNodo(nodo.derecho, valor);
        } else {
            // Si el valor es el mismo que el valor del nodo, este es el nodo que se debe eliminar

            // Casos con un solo hijo o sin hijos
            if (nodo.izquierdo == null) {
                return nodo.derecho;
            } else if (nodo.derecho == null) {
                return nodo.izquierdo;
            }

            // Caso con dos hijos: obtén el sucesor en orden (el nodo más pequeño en la subárbol derecho)
            nodo.valor = minValue(nodo.derecho);

            // Elimina el sucesor en orden
            nodo.derecho = removerNodo(nodo.derecho, nodo.valor);
        }
        return nodo;
    }

    private int minValue(NodoRojoNegro nodo) {
        int minv = nodo.valor;
        while (nodo.izquierdo != null) {
            minv = nodo.izquierdo.valor;
            nodo = nodo.izquierdo;
        }
        return minv;
    }

    @Override
    public void preOrder() {
        preOrder(raiz);
    }

    private void preOrder(NodoRojoNegro nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            preOrder(nodo.izquierdo);
            preOrder(nodo.derecho);
        }
    }

    @Override
    public void postOrder() {
        postOrder(raiz);
    }

    private void postOrder(NodoRojoNegro nodo) {
        if (nodo != null) {
            postOrder(nodo.izquierdo);
            postOrder(nodo.derecho);
            System.out.print(nodo.valor + " ");
        }
    }
}