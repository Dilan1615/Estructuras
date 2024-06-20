import estructura.*;

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Estructura arbol = new Arbol(10);
        arbol.agregar(5);
        arbol.agregar(6);
        arbol.agregar(12);
        arbol.agregar(90);
        arbol.agregar(3);

        // Recorrido InOrden
        // Debería imprimir los valores en orden ascendente
        System.out.println("Recorrido InOrden:");
        ((Arbol) arbol).InOrden();

        // Recorrido PreOrden
        System.out.println("Recorrido PreOrden:");
        ((Arbol) arbol).PreOrden();

        // Recorrido PostOrden
        // Debería imprimir los valores de los subárboles primero y finalmente el valor de la raíz
        System.out.println("Recorrido PostOrden:");
        ((Arbol) arbol).PostOrden();


        System.out.println("Lista Enlazada:");
        ListaEnlazada lista = new ListaEnlazadaSimple();
        ((ListaEnlazadaSimple) lista).agregar(1);
        ((ListaEnlazadaSimple) lista).agregar(2);
        ((ListaEnlazadaSimple) lista).agregar(3);
        ((ListaEnlazadaSimple) lista).imprimir();

        System.out.println("Lista Circular:");
        ListaDobleEnlazada listaDoble = new ListaDobleEnlazada();
        listaDoble.agregar(1);
        listaDoble.agregar(2);
        listaDoble.agregar(3);
        listaDoble.imprimir();

        System.out.println("Lista Circular:");
        ListaCircular listaCircular = new ListaCircular();
        listaCircular.agregar(17);
        listaCircular.agregar(21);
        listaCircular.agregar(26);
        listaCircular.imprimir();

        System.out.println("Lista Doblemente Circular:");
        ListaDoblementeCircular listaDobleCircular = new ListaDoblementeCircular();
        listaDobleCircular.agregar(9);
        listaDobleCircular.agregar(10);
        listaDobleCircular.agregar(78);
        listaDobleCircular.imprimir();
        }
    }

