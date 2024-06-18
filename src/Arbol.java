// Clase abstracta para árboles
public abstract class Arbol {
    ArbolNodo raiz;

    public abstract void añadir(int valor);
    public abstract void remover(int valor);
    public abstract void inOrder();
    public abstract void preOrder();
    public abstract void postOrder();
}