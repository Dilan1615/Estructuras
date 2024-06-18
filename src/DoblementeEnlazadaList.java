// Lista doblemente enlazada
class DoblementeEnlazadaList extends List {
    @Override
    public void añadir(int valor) {
        DoblementeEnlazadaNodo nuevoNodo = new DoblementeEnlazadaNodo();
        nuevoNodo.setValor(valor);
        nuevoNodo.setSiguiente((DoblementeEnlazadaNodo) head);

        if (head != null) {
            ((DoblementeEnlazadaNodo) head).setPrevio(nuevoNodo);
        }

        head = nuevoNodo;
    }

    @Override
    public void insertar(int index, int valor) {
        DoblementeEnlazadaNodo nuevoNodo = new DoblementeEnlazadaNodo();
        nuevoNodo.setValor(valor);

        if (index == 0) {
            nuevoNodo.setSiguiente((DoblementeEnlazadaNodo) head);
            if (head != null) {
                ((DoblementeEnlazadaNodo) head).setPrevio(nuevoNodo);
            }
            head = nuevoNodo;
        } else {
            DoblementeEnlazadaNodo nodoActual = (DoblementeEnlazadaNodo) head;
            for (int i = 0; i < index - 1; i++) {
                if (nodoActual != null) {
                    nodoActual = (DoblementeEnlazadaNodo) nodoActual.getSiguiente();
                }
            }
            if (nodoActual != null) {
                nuevoNodo.setSiguiente((DoblementeEnlazadaNodo) nodoActual.getSiguiente());
                nuevoNodo.setPrevio(nodoActual);
                nodoActual.setSiguiente(nuevoNodo);
                if (nuevoNodo.getSiguiente() != null) {
                    ((DoblementeEnlazadaNodo) nuevoNodo.getSiguiente()).setPrevio(nuevoNodo);
                }
            }
        }
    }

    @Override
    public void remover(int valor) {
        DoblementeEnlazadaNodo nodoActual = (DoblementeEnlazadaNodo) head;
        while (nodoActual != null) {
            if (nodoActual.getValor() == valor) {
                if (nodoActual.getPrevio() != null) {
                    nodoActual.getPrevio().setSiguiente(nodoActual.getSiguiente());
                } else {
                    head = nodoActual.getSiguiente();
                }
                if (nodoActual.getSiguiente() != null) {
                    ((DoblementeEnlazadaNodo) nodoActual.getSiguiente()).setPrevio(nodoActual.getPrevio());
                }
                return;
            }
            nodoActual = (DoblementeEnlazadaNodo) nodoActual.getSiguiente();
        }
    }
}