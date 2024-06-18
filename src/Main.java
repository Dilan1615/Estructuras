import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataStructureManager manager = new DataStructureManager();
        Scanner scanner = new Scanner(System.in);
        String option;
        int value;

        while (true) {
            System.out.println("Seleccione la estructura de datos:");
            System.out.println("1. Lista enlazada");
            System.out.println("2. Lista doblemente enlazada");
            System.out.println("3. Lista circular");
            System.out.println("4. Lista doblemente circular");
            System.out.println("5. Árbol AVL");
            System.out.println("6. Árbol Rojo-Negro");
            System.out.println("7. Salir");

            option = scanner.nextLine();

            switch (option) {
                case "1":
                    manager.setStructure("lista enlazada");
                    break;
                case "2":
                    manager.setStructure("lista doblemente enlazada");
                    break;
                case "3":
                    manager.setStructure("lista circular");
                    break;
                case "4":
                    manager.setStructure("lista doblemente circular");
                    break;
                case "5":
                    manager.setStructure("árbol avl");
                    break;
                case "6":
                    manager.setStructure("árbol rojo negro");
                    break;
                case "7":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    continue;
            }

            while (true) {
                System.out.println("Seleccione la operación:");
                System.out.println("1. Añadir");
                System.out.println("2. Eliminar");
                System.out.println("3. Recorrer (InOrder para árboles)");
                System.out.println("4. Volver");

                option = scanner.nextLine();

                switch (option) {
                    case "1":
                        System.out.print("Ingrese el valor a añadir: ");
                        value = Integer.parseInt(scanner.nextLine());
                        manager.add(value);
                        break;
                    case "2":
                        System.out.print("Ingrese el valor a eliminar: ");
                        value = Integer.parseInt(scanner.nextLine());
                        manager.delete(value);
                        break;
                    case "3":
                        manager.inOrder(); // Asumiendo que solo se hará inOrder traversal para los árboles
                        break;
                    case "4":
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                        continue;
                }

                if (option.equals("4")) {
                    break;
                }
            }
        }
    }
}
