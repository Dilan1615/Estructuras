package estructura;

public class Nodo implements INodo{
    private int valor;
    private Nodo izquierda;
    private Nodo derecha;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(int valor) {
     this.valor = valor;
        this.anterior = null;
    }
    public Nodo getSiguiente() {
        return this.siguiente;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public int getValor() {
        return this.valor;
    }

    public Nodo getAnterior() {
        return this.anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public boolean agregar(int valor){
        if (this.valor > valor) {
            if (this.izquierda == null) {
                this.izquierda = new Nodo(valor);
                return true;
            }else {
                this.izquierda.agregar(valor);
            }
        }else {
            if (this.derecha == null) {
                this.derecha = new Nodo(valor);
                return true;
            }else {
                this.derecha.agregar(valor);
            }
        }
        return false;
    }

    public void InOrden(){
        if (this.izquierda != null) {
            this.izquierda.InOrden();
        }
        if (this.derecha != null) {
            this.derecha.InOrden();
        }
        System.out.println(this.valor);
    }
    public void PreOrden(){
        System.out.println(this.valor);
        if (this.izquierda != null) {
            this.izquierda.PreOrden();
        }
        if (this.derecha != null) {
            this.derecha.PreOrden();
        }
    }
    public void PostOrden(){
        if (this.izquierda != null) {
            this.izquierda.PostOrden();
        }
        if (this.derecha != null) {
            this.derecha.PostOrden();
        }
        System.out.println(this.valor);
    }
}
