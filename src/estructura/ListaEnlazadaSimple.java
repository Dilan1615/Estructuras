package estructura;

public class ListaEnlazadaSimple implements ListaEnlazada {
    private Nodo head;

    public void agregar(int valor) {
        if (head == null) {
            head = new Nodo(valor);
        } else {
            Nodo temp = head;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(new Nodo(valor));
        }
    }

    public void imprimir() {
        Nodo temp = head;
        while (temp != null) {
            System.out.println(temp.getValor());
            temp = temp.getSiguiente();
        }
    }
}