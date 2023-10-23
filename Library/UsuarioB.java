import java.util.Scanner;
import java.util.ArrayList;

public class UsuarioB {
    public static void main(String[] args) {
        // Crear algunos libros
        Libro libro1 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 3, "Fantasía");
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 5, "Realismo mágico");
        Libro libro3 = new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", 2, "Fantasía");

        // Crear una biblioteca
        ABiblioteca biblioteca = new ABiblioteca();

        // Agregar libros a la biblioteca
        biblioteca.addBook(libro1);
        biblioteca.addBook(libro2);
        biblioteca.addBook(libro3);

        // Interacción con el usuario
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("---- Biblioteca ----");
            System.out.println("1. Ver libros disponibles");
            System.out.println("2. Pedir prestado un libro");
            System.out.println("3. Devolver un libro");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Mostrar libros disponibles y cuántos
                    ArrayList<Libro> disponibles = biblioteca.getLibrosDisponibles();
                    System.out.println("Libros disponibles en la biblioteca (" + disponibles.size() + " en total):");
                    for (Libro libro : disponibles) {
                        System.out.println("Título: " + libro.getTitle() + " (" + libro.getAuthor() + ")");
                    }
                    break;
                case 2:
                    // Pedir prestado un libro
                    System.out.print("Ingresa el título del libro que deseas pedir prestado: ");
                    scanner.nextLine(); // Limpiar el buffer de entrada
                    String tituloParaPrestar = scanner.nextLine();
                    if (biblioteca.prestarLibro(tituloParaPrestar)) {
                        System.out.println("Libro '" + tituloParaPrestar + "' prestado con éxito.");
                    } else {
                        System.out.println("No se pudo prestar el libro '" + tituloParaPrestar + "'.");
                    }
                    break;
                case 3:
                    // Devolver un libro
                    System.out.print("Ingresa el título del libro que deseas devolver: ");
                    scanner.nextLine(); // Limpiar el buffer de entrada
                    String tituloParaDevolver = scanner.nextLine();
                    // Asumiendo que se registra un libro como "devuelto" de manera efectiva
                    // En un sistema real, esto requeriría un proceso de seguimiento adicional.
                    System.out.println("Libro '" + tituloParaDevolver + "' devuelto con éxito.");
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }

}
