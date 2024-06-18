
class AVLArbol extends Arbol {
    NodoAVL raiz;

    int altura(NodoAVL N) {
        if (N == null)
            return 0;
        return N.altura;
    }

    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    NodoAVL rotarDerecha(NodoAVL y) {
        NodoAVL x = y.izquierdo;
        NodoAVL T2 = x.derecho;

        x.derecho = y;
        y.izquierdo = T2;

        y.altura = max(altura(y.izquierdo), altura(y.derecho)) + 1;
        x.altura = max(altura(x.izquierdo), altura(x.derecho)) + 1;

        return x;
    }

    NodoAVL rotarIzquierda(NodoAVL x) {
        NodoAVL y = x.derecho;
        NodoAVL T2 = y.izquierdo;

        y.izquierdo = x;
        x.derecho = T2;

        x.altura = max(altura(x.izquierdo), altura(x.derecho)) + 1;
        y.altura = max(altura(y.izquierdo), altura(y.derecho)) + 1;

        return y;
    }

    int getBalance(NodoAVL N) {
        if (N == null)
            return 0;
        return altura(N.izquierdo) - altura(N.derecho);
    }

    NodoAVL añadirNodo(NodoAVL nodo, int valor) {
        if (nodo == null)
            return (new NodoAVL(valor));

        if (valor < nodo.valor)
            nodo.izquierdo = añadirNodo(nodo.izquierdo, valor);
        else if (valor > nodo.valor)
            nodo.derecho = añadirNodo(nodo.derecho, valor);
        else
            return nodo;

        nodo.altura = 1 + max(altura(nodo.izquierdo), altura(nodo.derecho));

        int balance = getBalance(nodo);

        if (balance > 1 && valor < nodo.izquierdo.valor)
            return rotarDerecha(nodo);

        if (balance < -1 && valor > nodo.derecho.valor)
            return rotarIzquierda(nodo);

        if (balance > 1 && valor > nodo.izquierdo.valor) {
            nodo.izquierdo = rotarIzquierda(nodo.izquierdo);
            return rotarDerecha(nodo);
        }

        if (balance < -1 && valor < nodo.derecho.valor) {
            nodo.derecho = rotarDerecha(nodo.derecho);
            return rotarIzquierda(nodo);
        }

        return nodo;
    }

    NodoAVL minValueNode(NodoAVL node) {
        NodoAVL current = node;

        while (current.izquierdo != null)
            current = current.izquierdo;

        return current;
    }

    NodoAVL removerNodo(NodoAVL raiz, int valor) {
        if (raiz == null)
            return raiz;

        if (valor < raiz.valor)
            raiz.izquierdo = removerNodo(raiz.izquierdo, valor);

        else if (valor > raiz.valor)
            raiz.derecho = removerNodo(raiz.derecho, valor);

        else {
            if ((raiz.izquierdo == null) || (raiz.derecho == null)) {
                NodoAVL temp = null;
                if (temp == raiz.izquierdo)
                    temp = raiz.derecho;
                else
                    temp = raiz.izquierdo;

                if (temp == null) {
                    temp = raiz;
                    raiz = null;
                } else
                    raiz = temp;
            } else {
                NodoAVL temp = minValueNode(raiz.derecho);

                raiz.valor = temp.valor;

                raiz.derecho = removerNodo(raiz.derecho, temp.valor);
            }
        }

        if (raiz == null)
            return raiz;

        raiz.altura = max(altura(raiz.izquierdo), altura(raiz.derecho)) + 1;

        int balance = getBalance(raiz);

        if (balance > 1 && getBalance(raiz.izquierdo) >= 0)
            return rotarDerecha(raiz);

        if (balance > 1 && getBalance(raiz.izquierdo) < 0) {
            raiz.izquierdo = rotarIzquierda(raiz.izquierdo);
            return rotarDerecha(raiz);
        }

        if (balance < -1 && getBalance(raiz.derecho) <= 0)
            return rotarIzquierda(raiz);

        if (balance < -1 && getBalance(raiz.derecho) > 0) {
            raiz.derecho = rotarDerecha(raiz.derecho);
            return rotarIzquierda(raiz);
        }

        return raiz;
    }

    void preOrder(NodoAVL nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            preOrder(nodo.izquierdo);
            preOrder(nodo.derecho);
        }
    }

    void inOrder(NodoAVL nodo) {
        if (nodo != null) {
            inOrder(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inOrder(nodo.derecho);
        }
    }

    void postOrder(NodoAVL nodo) {
        if (nodo != null) {
            postOrder(nodo.izquierdo);
            postOrder(nodo.derecho);
            System.out.print(nodo.valor + " ");
        }
    }

    @Override
    public void añadir(int valor) {
        raiz = añadirNodo(raiz, valor);
    }

    @Override
    public void remover(int valor) {
        raiz = removerNodo(raiz, valor);
    }

    @Override
    public void inOrder() {
        inOrder(raiz);
        System.out.println();
    }

    @Override
    public void preOrder() {
        preOrder(raiz);
        System.out.println();
    }

    @Override
    public void postOrder() {
        postOrder(raiz);
        System.out.println();
    }
}