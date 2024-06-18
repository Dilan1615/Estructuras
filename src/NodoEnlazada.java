// Nodo para lista enlazada
class NodoEnlazada extends Nodo {
    NodoEnlazada siguiente;

    public NodoEnlazada getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoEnlazada nodo) {
        this.siguiente = nodo;
    }
}
