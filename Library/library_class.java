import java.util.ArrayList;

public class Library {
    private ArrayList<Libro> catalogo;

    public Library() {
        catalogo = new ArrayList<>();
    }

    public void addBook(Libro libro) {
        catalogo.add(libro);
    }

    public boolean deleteBook(String titulo) {
        for (Libro libro : catalogo) {
            if (libro.getTitulo().equals(titulo)) {
                catalogo.remove(libro);
                return true; // Libro eliminado con éxito
            }
        }
        return false; // No se encontró el libro en la biblioteca
    }

    public ArrayList<Libro> buscarPorTitulo(String titulo) {
        ArrayList<Libro> resultados = new ArrayList<>();
        for (Libro libro : catalogo) {
            if (libro.getTitulo().equals(titulo)) {
                resultados.add(libro);
            }
        }
        return resultados;
    }

    public ArrayList<Libro> buscarPorAutor(String autor) {
        ArrayList<Libro> resultados = new ArrayList<>();
        for (Libro libro : catalogo) {
            if (libro.getAutor().equals(autor)) {
                resultados.add(libro);
            }
        }
        return resultados;
    }

    public boolean prestarLibro(String titulo) {
        for (Libro libro : catalogo) {
            if (libro.getTitulo().equals(titulo)) {
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
