// Lista doblemente circular
class DoblementeCircularList extends List {
    @Override
    public void añadir(int valor) {
        DoblementeEnlazadaNodo nuevoNodo = new DoblementeEnlazadaNodo();
        nuevoNodo.setValor(valor);

        if (head == null) {
            head = nuevoNodo;
            nuevoNodo.setSiguiente((DoblementeEnlazadaNodo) head);
            nuevoNodo.setPrevio((DoblementeEnlazadaNodo) head);
        } else {
            DoblementeEnlazadaNodo temp = (DoblementeEnlazadaNodo) head;
            while (temp.getSiguiente() != head) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
            nuevoNodo.setPrevio(temp);
            nuevoNodo.setSiguiente((DoblementeEnlazadaNodo) head);
            ((DoblementeEnlazadaNodo) head).setPrevio(nuevoNodo);
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