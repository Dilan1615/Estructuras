// Lista enlazada
class EnlazadaList extends List {
    @Override
    public void añadir(int valor) {
        NodoEnlazada nuevoNodo = new NodoEnlazada();
        nuevoNodo.setValor(valor);
        nuevoNodo.setSiguiente((NodoEnlazada) head);
        head = nuevoNodo;
    }

    @Override
    public void insertar(int index, int valor) {
        // Implementar inserción en índice específico
    }

    @Override
    public void remover(int valor) {
        // Implementar eliminación por valor
    }
}

