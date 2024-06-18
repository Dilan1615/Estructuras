// Clase abstracta para listas
public abstract class List {
    Nodo head;

    public abstract void añadir(int valor);
    public abstract void insertar(int index, int valor);
    public abstract void remover(int valor);
}