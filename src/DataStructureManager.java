// Clase para manejar diferentes estructuras de datos y árboles
class DataStructureManager {
    private List linkedList;
    private List doublyLinkedList;
    private List circularLinkedList;
    private List doublyCircularLinkedList;
    private Arbol avlTree;
    private Arbol redBlackTree;

    private String currentStructure;

    public DataStructureManager() {
        this.linkedList = new EnlazadaList();
        this.doublyLinkedList = new DoblementeEnlazadaList();
        this.circularLinkedList = new CircularList();
        this.doublyCircularLinkedList = new DoblementeCircularList();
        this.avlTree = new AVLArbol();
        this.redBlackTree = new NodoRojoNegro(0);
        this.currentStructure = "";
    }

    public void setStructure(String structureType) {
        this.currentStructure = structureType.toLowerCase();
        System.out.println("Estructura seleccionada: " + this.currentStructure);
    }

    public void add(int value) {
        switch (this.currentStructure) {
            case "lista enlazada":
                linkedList.añadir(value);
                break;
            case "lista doblemente enlazada":
                doublyLinkedList.añadir(value);
                break;
            case "lista circular":
                circularLinkedList.añadir(value);
                break;
            case "lista doblemente circular":
                doublyCircularLinkedList.añadir(value);
                break;
            case "arbol avl":
                avlTree.añadir(value);
                break;
            case "arbol rojo negro":
                redBlackTree.añadir(value);
                break;
            default:
                System.out.println("Estructura no reconocida.");
        }
    }

    public void delete(int value) {
        switch (this.currentStructure) {
            case "lista enlazada":
                linkedList.remover(value);
                break;
            case "lista doblemente enlazada":
                doublyLinkedList.remover(value);
                break;
            case "lista circular":
                circularLinkedList.remover(value);
                break;
            case "lista doblemente circular":
                doublyCircularLinkedList.remover(value);
                break;
            case "arbol avl":
                avlTree.remover(value);
                break;
            case "arbol rojo negro":
                redBlackTree.remover(value);
                break;
            default:
                System.out.println("Estructura no reconocida.");
        }
    }

    public void inOrder() {
        switch (this.currentStructure) {
            case "arbol avl":
                avlTree.inOrder();
                break;
            case "arbol rojo negro":
                redBlackTree.inOrder();
                break;
            default:
                System.out.println("Operación inOrder no soportada para esta estructura.");
        }
    }

    public void preOrder() {
        switch (this.currentStructure) {
            case "arbol avl":
                avlTree.preOrder();
                break;
            case "arbol rojo negro":
                redBlackTree.preOrder();
                break;
            default:
                System.out.println("Operación preOrder no soportada para esta estructura.");
        }
    }

    public void postOrder() {
        switch (this.currentStructure) {
            case "arbol avl":
                avlTree.postOrder();
                break;
            case "arbol rojo negro":
                redBlackTree.postOrder();
                break;
            default:
                System.out.println("Operación postOrder no soportada para esta estructura.");
        }
    }
}
