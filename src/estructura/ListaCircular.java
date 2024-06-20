package estructura;

public class ListaCircular implements ListaEnlazada {
    private Nodo head;
    private Nodo tail;

    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (head == null) {
            head = tail = nuevo;
            tail.setSiguiente(head);
        } else {
            tail.setSiguiente(nuevo);
            tail = nuevo;
            tail.setSiguiente(head);
        }
    }

    public void imprimir() {
        if (head == null) return;
        Nodo temp = head;
        do {
            System.out.println(temp.getValor());
            temp = temp.getSiguiente();
        } while (temp != head);
    }
}