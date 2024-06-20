package estructura;

public class ListaDobleEnlazada implements ListaEnlazada {
    private Nodo head;
    private Nodo tail;

    @Override
    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (head == null) {
            head = tail = nuevo;
        } else {
            tail.setSiguiente(nuevo);
            nuevo.setAnterior(tail);
            tail = nuevo;
        }
    }

    @Override
    public void imprimir() {
        Nodo temp = head;
        while (temp != null) {
            System.out.println(temp.getValor());
            temp = temp.getSiguiente();
        }
    }
}