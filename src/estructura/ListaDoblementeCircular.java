package estructura;

public class ListaDoblementeCircular implements ListaEnlazada {
    private Nodo head;
    private Nodo tail;

    @Override
    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (head == null) {
            head = tail = nuevo;
            head.setAnterior(tail);
            tail.setSiguiente(head);
        } else {
            tail.setSiguiente(nuevo);
            nuevo.setAnterior(tail);
            tail = nuevo;
            tail.setSiguiente(head);
            head.setAnterior(tail);
        }
    }

    @Override
    public void imprimir() {
        if (head == null) return;
        Nodo temp = head;
        do {
            System.out.println(temp.getValor());
            temp = temp.getSiguiente();
        } while (temp != head);
    }
}