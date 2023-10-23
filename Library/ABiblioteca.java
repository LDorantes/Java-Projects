import java.util.ArrayList;

public class ABiblioteca {
    private ArrayList<Libro> catalogo;

    public ABiblioteca() {
        catalogo = new ArrayList<>();
    }

    public void addBook(Libro libro) {
        catalogo.add(libro);
    }

    // Método para obtener una copia del catálogo
    public ArrayList<Libro> getCatalogo() {
        return new ArrayList<>(catalogo); // Devuelve una copia del catálogo
    }

    // Método para consultar los libros disponibles
    public ArrayList<Libro> getLibrosDisponibles() {
        ArrayList<Libro> disponibles = new ArrayList<>();
        for (Libro libro : catalogo) {
            if (libro.isDisponible()) {
                disponibles.add(libro);
            }
        }
        return disponibles;
    }

    public boolean deleteBook(String titulo) {
        for (Libro libro : catalogo) {
            if (libro.getTitle().equals(titulo)) {
                catalogo.remove(libro);
                return true; // Libro eliminado con éxito
            }
        }
        return false; // No se encontró el libro en la biblioteca
    }

    public ArrayList<Libro> buscarPorTitulo(String titulo) {
        ArrayList<Libro> resultados = new ArrayList<>();
        for (Libro libro : catalogo) {
            if (libro.getTitle().equals(titulo)) {
                resultados.add(libro);
            }
        }
        return resultados;
    }

    public ArrayList<Libro> buscarPorAutor(String autor) {
        ArrayList<Libro> resultados = new ArrayList<>();
        for (Libro libro : catalogo) {
            if (libro.getAuthor().equals(autor)) {
                resultados.add(libro);
            }
        }
        return resultados;
    }

    public boolean prestarLibro(String titulo) {
        for (Libro libro : catalogo) {
            if (libro.getTitle().equals(titulo)) {
                if (libro.isDisponible()) {
                    libro.setDisponible(false);
                    return true; // Libro prestado con éxito
                } else {
                    return false; // El libro no está disponible en este momento
                }
            }
        }
        return false; // No se encontró el libro en la biblioteca
    }
}
