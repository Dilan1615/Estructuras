// Lista circular
class CircularList extends List {
    @Override
    public void añadir(int valor) {
        NodoEnlazada nuevoNodo = new NodoEnlazada();
        nuevoNodo.setValor(valor);

        if (head == null) {
            head = nuevoNodo;
            nuevoNodo.setSiguiente((NodoEnlazada) head);
        } else {
            NodoEnlazada temp = (NodoEnlazada) head;
            while (temp.getSiguiente() != head) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
            nuevoNodo.setSiguiente((NodoEnlazada) head);
        }
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
