// Nodo para árbol
class ArbolNodo {
    int valor;
    ArbolNodo izq, der;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public ArbolNodo getIzq() {
        return izq;
    }

    public void setIzq(ArbolNodo nodo) {
        this.izq = nodo;
    }

    public ArbolNodo getDer() {
        return der;
    }

    public void setDer(ArbolNodo nodo) {
        this.der = nodo;
    }
}