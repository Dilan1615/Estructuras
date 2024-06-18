// Nodo para lista doblemente enlazada
class DoblementeEnlazadaNodo extends Nodo {
    DoblementeEnlazadaNodo siguiente;
    DoblementeEnlazadaNodo previo;

    public DoblementeEnlazadaNodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(DoblementeEnlazadaNodo nodo) {
        this.siguiente = nodo;
    }

    public DoblementeEnlazadaNodo getPrevio() {
        return previo;
    }

    public void setPrevio(DoblementeEnlazadaNodo nodo) {
        this.previo = nodo;
    }
}

