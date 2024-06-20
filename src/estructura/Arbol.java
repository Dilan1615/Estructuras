package estructura;

public class Arbol implements Estructura{
    private Nodo raiz;

    public Arbol(int valor){
        this.raiz = new Nodo(valor);
    }

    @Override
    public boolean agregar(int valor) {
        return raiz.agregar( valor);
    }

    public void PostOrden(){
        this.raiz.PostOrden();
    }
    public void PreOrden(){
        this.raiz.PreOrden();
    }
    public void InOrden(){
        this.raiz.InOrden();
    }
}
