public class Libro {
    private String title;
    private String author;
    private String genre;
    private int availability;

    public Libro(String title, String author, int availability, String genre) {
        this.title = title;
        this.author = author;
        this.availability = availability;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    // Método para obtener el autor
    public String getAuthor() {
        return author;
    }

    // Método para verificar la disponibilidad
    public boolean isDisponible() {
        return availability > 0;
    }

    // Método para establecer la disponibilidad
    public void setDisponible(boolean disponible) {
        if (disponible) {
            availability = 1; // Libro disponible
        } else {
            availability = 0; // Libro no disponible
        }
    }
}
